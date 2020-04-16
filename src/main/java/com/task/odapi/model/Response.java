package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    @JsonProperty("airportResponse")
    private Map<String, AirportResponse> Airports;
    @JsonProperty("countriesResponse")
    private Map<String, CountriesResponse> Countries;
    @JsonProperty("regionResponse")
    private Map<String, RegionResponse> Regions;
    @JsonProperty("routeResponse")
    private Map<String, RouteResponse> RouteSets;
    @JsonProperty("Source")
    private String Source;
    @JsonProperty("TimeStamp")
    private String TimeStamp;

    public Map<String, AirportResponse> getAirports() {
        return Airports;
    }

    public void setAirports(Map<String, AirportResponse> airports) {
        Airports = airports;
    }

    public Map<String, CountriesResponse> getCountries() {
        return Countries;
    }

    public void setCountries(Map<String, CountriesResponse> countries) {
        Countries = countries;
    }

    public Map<String, RegionResponse> getRegions() {
        return Regions;
    }

    public void setRegions(Map<String, RegionResponse> regions) {
        Regions = regions;
    }

    public Map<String, RouteResponse> getRouteSets() {
        return RouteSets;
    }

    public void setRouteSets(Map<String, RouteResponse> routeSets) {
        RouteSets = routeSets;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "Airports=" + Airports +
                ", Countries=" + Countries +
                ", Regions=" + Regions +
                ", RouteSets=" + RouteSets +
                ", Source='" + Source + '\'' +
                ", TimeStamp='" + TimeStamp + '\'' +
                '}';
    }
}
