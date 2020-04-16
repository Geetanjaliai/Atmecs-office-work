package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteResponse {
    @JsonProperty("OriginCode")
    private String OriginCode;
    @JsonProperty("DestinationCodes")
    private List<String> DestinationCodes;
    @JsonProperty("DestinationProperties")
    private List<DestinationProperties> DestinationProperties;

    public String getOriginCode() {
        return OriginCode;
    }

    public void setOriginCode(String originCode) {
        OriginCode = originCode;
    }

    public List<String> getDestinationCodes() {
        return DestinationCodes;
    }

    public void setDestinationCodes(List<String> destinationCodes) {
        DestinationCodes = destinationCodes;
    }

    public List<DestinationProperties> getDestinationProperties() {
        return DestinationProperties;
    }

    public void setDestinationProperties(List<DestinationProperties> destinationProperties) {
        DestinationProperties = destinationProperties;
    }

    @Override
    public String toString() {
        return "RouteResponse{" +
                "OriginCode='" + OriginCode + '\'' +
                ", DestinationCodes=" + DestinationCodes +
                ", DestinationProperties=" + DestinationProperties +
                '}';
    }
}
