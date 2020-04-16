package com.task.odapi.transform;

import com.google.gson.Gson;
import com.task.odapi.model.*;
import com.task.odapi.util.OD_API_CONSTANTS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ODAPITransformImpl implements ODAPITransform {

    private static final Logger log = LoggerFactory.getLogger(OD_API_CONSTANTS.LOG_MODULE_NAME.getValue());

    /*Reading the routes.json file and set the data to respective pojo class*/
    @Override
    public Map<String, RouteResponse> readRoutesJsonTransform() {
        HashMap<String, RouteResponse> routeResponseHashMap = new HashMap<String, RouteResponse>();
        List<Routes> routesList = null;
        RouteRequest routeRequest=new RouteRequest();
        try {
            Gson gson = new Gson();
            File file= ResourceUtils.getFile("classpath:routes.json");
            String content=new String(Files.readAllBytes(file.toPath()));
            routeRequest=gson.fromJson(content,RouteRequest.class);
        }
        catch (FileNotFoundException noFile) {
            log.warn("File not found");
        } catch (IOException e) {
            log.error("Error in reading the file");
        }
        routesList=routeRequest.getRoutes();
        Map<String, List<String>> destinationCodeMap = routesList.stream()
                .collect(Collectors.groupingBy(Routes::getOriginAirportCode,
                        Collectors.mapping(Routes::getDestinationAirportCode, Collectors.toList())));
        Map<String, DestinationProperties> destinationPropertiesHashMap = new HashMap<String, DestinationProperties>();
        for (Routes route : routesList) {
            DestinationProperties destinationProperties = new DestinationProperties();
            destinationProperties.setI(route.isInterline() ? 1 : 0);
            destinationProperties.setC(route.isCodeShare()? 1: 0);
            destinationPropertiesHashMap.put(route.getDestinationAirportCode(), destinationProperties);
        }

        for (Routes routes : routesList.stream().filter(Objects::nonNull).collect(Collectors.toList())) {
            RouteResponse routeResponse = new RouteResponse();
            routeResponse.setOriginCode(routes.getOriginAirportCode());
            routeResponse.setDestinationCodes(destinationCodeMap.get(routes.getOriginAirportCode()));
            routeResponse.setDestinationProperties(routeResponse.getDestinationCodes().stream()
                    .map(destcode -> destinationPropertiesHashMap.get(destcode)).collect(Collectors.toList()));
            routeResponseHashMap.put(routeResponse.getOriginCode(), routeResponse);

        }
        return routeResponseHashMap;
    }
    /*Reading the region.json file and set the data to respective pojo class*/
    @Override
    public Map<String, RegionResponse> readRegionsJsonTransform(){
        HashMap<String, RegionResponse> regionResponseHashMap = new HashMap<String, RegionResponse>();
        RegionRequest regionRequest=null;
        try {
            Gson gson = new Gson();
            File file= ResourceUtils.getFile("classpath:regions.json");
            String content=new String(Files.readAllBytes(file.toPath()));
            regionRequest=gson.fromJson(content,RegionRequest.class);
        }
        catch (FileNotFoundException noFile) {
            log.warn("File not found");
        } catch (IOException e) {
            log.error("Error in reading the file");
        }
        regionRequest.getRegions().stream().filter(Objects::nonNull).map(regions -> {
            RegionResponse regionResponse = new RegionResponse();
            regionResponse.setCode(regions.getRegionCode());
            regionResponse.setName(regions.getRegionName());
            regionResponseHashMap.put(regionResponse.getCode(), regionResponse);
            return regionResponse;
        }).collect(Collectors.toList());
        return regionResponseHashMap;

    }
    /*Reading the countries.json file and set the data to respective pojo class*/
    @Override
    public Map<String, CountriesResponse> readCountriesJsonTransform() {
        HashMap<String, CountriesResponse> countriesResponseHashMap = new HashMap<String, CountriesResponse>();
        CountriesRequest countriesRequest=null;
        try {
            Gson gson = new Gson();
            File file= ResourceUtils.getFile("classpath:countries.json");
            String content=new String(Files.readAllBytes(file.toPath()));
            countriesRequest=gson.fromJson(content,CountriesRequest.class);
        }
        catch (FileNotFoundException noFile) {
            log.warn("File not found");
        } catch (IOException e) {
            log.error("Error in reading the file");
        }
        countriesRequest.getCountries().stream().filter(Objects::nonNull).map(countries -> {
            CountriesResponse countriesResponse = new CountriesResponse();
            countriesResponse.setCode(countries.getCountryCode2());
            countriesResponse.setName(countries.getCountryName());
            countriesResponse.setRegionCodes(countries.getRegionCodes());
            countriesResponseHashMap.put(countriesResponse.getCode(), countriesResponse);
            return countriesResponse;
        }).collect(Collectors.toList());
        return countriesResponseHashMap;
    }
    /*Reading the origin.json file and set the data to respective pojo class*/
    @Override
    public Map<String, AirportResponse> readOriginJsonTransform(){

        AirportResponse airportResponse = null;
        HashMap<String, AirportResponse> originResponseHashMap = null;
        List<Airports> airportListData = null;

        Gson gson = new Gson();
        File file= null;
        String content=null;
        try {
            file = ResourceUtils.getFile("classpath:origins.json");
            content=new String(Files.readAllBytes(file.toPath()));
        } catch (FileNotFoundException noFile) {
            log.warn("File not found");
        } catch (IOException e) {
            log.error("Error in reading the file");
        }
        OriginRequest originRequest=gson.fromJson(content,OriginRequest.class);
        String contentCountry=null;
        try {
            file= ResourceUtils.getFile("classpath:countries.json");
            contentCountry=new String(Files.readAllBytes(file.toPath()));
        } catch (FileNotFoundException noFile) {
            log.warn("File not found");
        } catch (IOException e) {
           log.error("Error in reading the file");
        }

        CountriesRequest countriesRequest = gson.fromJson(contentCountry,CountriesRequest.class);
        List<Countries> countryList = countriesRequest.getCountries();
        airportListData = originRequest.getAirports();
        Map<String, List<String>> childMacCodeMap = airportListData.stream()
                .filter(airport -> airport.getMetropolitanAreaCode() != null)
                .collect(Collectors.groupingBy(Airports::getMetropolitanAreaCode,
                        Collectors.mapping(Airports::getIATAAirportCode, Collectors.toList())));
        originResponseHashMap = new HashMap<String, AirportResponse>();
        for (Airports airport : airportListData) {
            if (airport.getMetropolitanAreaCode() != null) {
                airportResponse = new AirportResponse();
                airportResponse.setCode(airport.getMetropolitanAreaCode());
                airportResponse.setCity(airport.getMetropolitanAreaName());
                airportResponse.setName(airport.getMetropolitanAreaName());
                airportResponse.setDefaultDisplayName(airport.getMetropolitanAreaName());
                airportResponse.setStateCode(airport.getStateCode() == null ? "" : airport.getStateCode());
                airportResponse.setCountryCode(airport.getCountryCode2());
                airportResponse.setCountryName(
                        countryList.stream().filter(code -> code.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                                .findAny().get().getCountryName());
                airportResponse.setBlueCity(airport.getIsJetBlue());
                airportResponse.setPreClearedStation(airport.getIsPreClearedDestination());
                airportResponse.setParentMACCode(airport.getMetropolitanAreaCode());
                airportResponse.setChildrenMACCodes(childMacCodeMap.get(airport.getMetropolitanAreaCode()));
                airportResponse.setMACCode(airportResponse.getChildrenMACCodes() == null ? false : true);
                airportResponse.setRegionCodes(
                        countryList.stream().filter(code -> code.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                                .findAny().get().getRegionCodes());
                originResponseHashMap.put(airportResponse.getCode(), airportResponse);
            }
            airportResponse = new AirportResponse();
            airportResponse.setCode(airport.getIATAAirportCode());
            airportResponse.setCity(airport.getCityName());
            airportResponse.setName(airport.getIATAAirportName());
            airportResponse.setDefaultDisplayName(airport.getAirportShortDisplayName());
            airportResponse.setStateCode(airport.getStateCode() == null ? "" : airport.getStateCode());
            airportResponse.setCountryCode(airport.getCountryCode2());
            airportResponse.setCountryName(
                    countryList.stream().filter(code -> code.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                            .findAny().get().getCountryName());
            airportResponse.setBlueCity(airport.getIsJetBlue());
            airportResponse.setPreClearedStation(airport.getIsPreClearedDestination());
            airportResponse.setParentMACCode(airport.getMetropolitanAreaCode());
            airportResponse.setChildrenMACCodes(null);
            airportResponse.setMACCode(airportResponse.getChildrenMACCodes() == null ? false : true);
            airportResponse.setRegionCodes(
                    countryList.stream().filter(code -> code.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                            .findAny().get().getRegionCodes());
            originResponseHashMap.put(airportResponse.getCode(), airportResponse);
        }
        return originResponseHashMap;
    }
}
