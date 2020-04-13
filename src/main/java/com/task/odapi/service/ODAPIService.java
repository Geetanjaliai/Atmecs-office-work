package com.task.odapi.service;

import com.task.odapi.model.*;
import java.util.Map;

public interface ODAPIService {
    public Map<String, RouteResponse> readRoutesJsonService();
    public Map<String, Response> getODAPIResponseService();
    public Map<String, RegionResponse> readRegionsJsonService();
    public Map<String, CountriesResponse> readCountriesJsonService();
    public Map<String, AirportResponse> readOriginJsonService();
}
