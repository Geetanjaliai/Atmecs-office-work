package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionRequest {

    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Regions")
    private List<Regions> Regions;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<com.task.odapi.model.Regions> getRegions() {
        return Regions;
    }

    public void setRegions(List<com.task.odapi.model.Regions> regions) {
        Regions = regions;
    }

    @Override
    public String toString() {
        return "RegionRequest{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Regions=" + Regions +
                '}';
    }
}
