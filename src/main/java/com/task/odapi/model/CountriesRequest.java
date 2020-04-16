package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountriesRequest {

    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Countries")
    private List<Countries> Countries;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<com.task.odapi.model.Countries> getCountries() {
        return Countries;
    }

    public void setCountries(List<com.task.odapi.model.Countries> countries) {
        Countries = countries;
    }

    @Override
    public String toString() {
        return "CountriesRequest{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Countries=" + Countries +
                '}';
    }
}
