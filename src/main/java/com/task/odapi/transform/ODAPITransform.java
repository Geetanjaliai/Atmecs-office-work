package com.task.odapi.transform;

import com.task.odapi.model.*;
import java.util.Map;

public interface ODAPITransform {
    public Map<String, RouteResponse> readRoutesJsonTransform();
    public Map<String, RegionResponse> readRegionsJsonTransform();
    public Map<String, CountriesResponse> readCountriesJsonTransform();
    public Map<String, AirportResponse> readOriginJsonTransform();
}
