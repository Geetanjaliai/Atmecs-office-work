package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountriesResponse {
    @JsonProperty("Code")
    private String Code;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("RegionCodes")
    private List<String> RegionCodes;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getRegionCodes() {
        return RegionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        RegionCodes = regionCodes;
    }

    @Override
    public String toString() {
        return "CountriesResponse{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", RegionCodes=" + RegionCodes +
                '}';
    }
}
