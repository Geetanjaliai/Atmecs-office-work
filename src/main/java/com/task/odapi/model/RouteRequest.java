package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteRequest {
    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Routes")
    private List<Routes> Routes;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<com.task.odapi.model.Routes> getRoutes() {
        return Routes;
    }

    public void setRoutes(List<com.task.odapi.model.Routes> routes) {
        Routes = routes;
    }

    @Override
    public String toString() {
        return "RouteRequest{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Routes=" + Routes +
                '}';
    }
}
