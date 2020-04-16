package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Routes {

    @JsonProperty("OriginAirportCode")
    private String OriginAirportCode;
    @JsonProperty("DestinationAirportCode")
    private String DestinationAirportCode;
    @JsonProperty("IsActive")
    private boolean IsActive;
    @JsonProperty("IsJetBlue")
    private boolean IsJetBlue;
    @JsonProperty("IsInterline")
    private boolean IsInterline;
    @JsonProperty("IsCodeShare")
    private boolean IsCodeShare;
    @JsonProperty("OperatingCarrierCodes")
    private List<String> OperatingCarrierCodes;

    public String getOriginAirportCode() {
        return OriginAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        OriginAirportCode = originAirportCode;
    }

    public String getDestinationAirportCode() {
        return DestinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        DestinationAirportCode = destinationAirportCode;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public boolean isJetBlue() {
        return IsJetBlue;
    }

    public void setJetBlue(boolean jetBlue) {
        IsJetBlue = jetBlue;
    }

    public boolean isInterline() {
        return IsInterline;
    }

    public void setInterline(boolean interline) {
        IsInterline = interline;
    }

    public boolean isCodeShare() {
        return IsCodeShare;
    }

    public void setCodeShare(boolean codeShare) {
        IsCodeShare = codeShare;
    }

    public List<String> getOperatingCarrierCodes() {
        return OperatingCarrierCodes;
    }

    public void setOperatingCarrierCodes(List<String> operatingCarrierCodes) {
        OperatingCarrierCodes = operatingCarrierCodes;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "OriginAirportCode='" + OriginAirportCode + '\'' +
                ", DestinationAirportCode='" + DestinationAirportCode + '\'' +
                ", IsActive=" + IsActive +
                ", IsJetBlue=" + IsJetBlue +
                ", IsInterline=" + IsInterline +
                ", IsCodeShare=" + IsCodeShare +
                ", OperatingCarrierCodes=" + OperatingCarrierCodes +
                '}';
    }
}
