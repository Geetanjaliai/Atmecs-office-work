package com.task.odapi.service;

import com.task.odapi.model.*;
import com.task.odapi.transform.ODAPITransformImpl;
import com.task.odapi.util.OD_API_CONSTANTS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class ODAPIServiceImpl implements ODAPIService {

    @Autowired
    ODAPITransformImpl odapiTransform;

    private static final Logger log = LoggerFactory.getLogger(OD_API_CONSTANTS.LOG_MODULE_NAME.getValue());

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
    String timestampvalue= formatter.format(date);

/*get routes data from transfrom class*/
    @Override
    public Map<String, RouteResponse> readRoutesJsonService(){
        Map<String, RouteResponse> routesResponse=odapiTransform.readRoutesJsonTransform();
        return routesResponse;
    }
    /*get origin,countries,regions,routes data and set to response pojo*/
    @Override
    public Map<String, Response> getODAPIResponseService() {
        HashMap<String, Response> responseHashMap = new HashMap<String, Response>();
        Response response=new Response();
        Map<String, AirportResponse> originResponseData = readOriginJsonService();
        Map<String, CountriesResponse> countryResponseData = readCountriesJsonService();
        Map<String, RegionResponse> regionsResponseData = readRegionsJsonService();
        Map<String, RouteResponse> routesResponseData = readRoutesJsonService();

        response.setAirports(originResponseData);
        response.setCountries(countryResponseData);
        response.setRegions(regionsResponseData);
        response.setRouteSets(routesResponseData);
        response.setSource("New");
        response.setTimeStamp(timestampvalue);
        responseHashMap.put("varodALL=", response);
       return responseHashMap;
    }
    /*get regions data from transfrom class*/
    @Override
    public Map<String, RegionResponse> readRegionsJsonService() {

        Map<String, RegionResponse> regionResponse=odapiTransform.readRegionsJsonTransform();
        return regionResponse;
    }
    /*get countries data from transfrom class*/
    @Override
    public Map<String, CountriesResponse> readCountriesJsonService(){
        Map<String, CountriesResponse> countriesResponse=odapiTransform.readCountriesJsonTransform();
        return countriesResponse;
    }
    /*get origins data from transfrom class*/
    @Override
    public Map<String, AirportResponse> readOriginJsonService(){
        Map<String, AirportResponse> originResponse=odapiTransform.readOriginJsonTransform();
        return originResponse;
    }
}
