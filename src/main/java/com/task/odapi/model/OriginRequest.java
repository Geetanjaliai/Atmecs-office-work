package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginRequest {

    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Airports")
    private List<Airports> Airports;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<com.task.odapi.model.Airports> getAirports() {
        return Airports;
    }

    public void setAirports(List<com.task.odapi.model.Airports> airports) {
        Airports = airports;
    }

    @Override
    public String toString() {
        return "OriginRequest{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Airports=" + Airports +
                '}';
    }
}
