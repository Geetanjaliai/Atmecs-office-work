package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirportTerminals {

    @JsonProperty("AirportTerminal")
    private String AirportTerminal;
    @JsonProperty("IsDomesticInboundTerminal")
    private boolean IsDomesticInboundTerminal;
    @JsonProperty("IsDomesticOutboundTerminal")
    private boolean IsDomesticOutboundTerminal;
    @JsonProperty("IsInternationalInboundTerminal")
    private boolean IsInternationalInboundTerminal;
    @JsonProperty("IsInternationalOutboundTerminal")
    private boolean IsInternationalOutboundTerminal;
    @JsonProperty("AirportTerminalCommentText")
    private String AirportTerminalCommentText;
    @JsonProperty("AirportTerminalStartTime")
    private String AirportTerminalStartTime;
    @JsonProperty("AirportTerminalEndTime")
    private String AirportTerminalEndTime;
    @JsonProperty("AirportTerminalEffectiveDate")
    private String AirportTerminalEffectiveDate;
    @JsonProperty("AirportTerminalEndDate")
    private String AirportTerminalEndDate;

    public void setAirportTerminal(String AirportTerminal){
        this.AirportTerminal = AirportTerminal;
    }
    public String getAirportTerminal(){
        return this.AirportTerminal;
    }
    public void setIsDomesticInboundTerminal(boolean IsDomesticInboundTerminal){
        this.IsDomesticInboundTerminal = IsDomesticInboundTerminal;
    }
    public boolean getIsDomesticInboundTerminal(){
        return this.IsDomesticInboundTerminal;
    }
    public void setIsDomesticOutboundTerminal(boolean IsDomesticOutboundTerminal){
        this.IsDomesticOutboundTerminal = IsDomesticOutboundTerminal;
    }
    public boolean getIsDomesticOutboundTerminal(){
        return this.IsDomesticOutboundTerminal;
    }
    public void setIsInternationalInboundTerminal(boolean IsInternationalInboundTerminal){
        this.IsInternationalInboundTerminal = IsInternationalInboundTerminal;
    }
    public boolean getIsInternationalInboundTerminal(){
        return this.IsInternationalInboundTerminal;
    }
    public void setIsInternationalOutboundTerminal(boolean IsInternationalOutboundTerminal){
        this.IsInternationalOutboundTerminal = IsInternationalOutboundTerminal;
    }
    public boolean getIsInternationalOutboundTerminal(){
        return this.IsInternationalOutboundTerminal;
    }
    public void setAirportTerminalCommentText(String AirportTerminalCommentText){
        this.AirportTerminalCommentText = AirportTerminalCommentText;
    }
    public String getAirportTerminalCommentText(){
        return this.AirportTerminalCommentText;
    }
    public void setAirportTerminalStartTime(String AirportTerminalStartTime){
        this.AirportTerminalStartTime = AirportTerminalStartTime;
    }
    public String getAirportTerminalStartTime(){
        return this.AirportTerminalStartTime;
    }
    public void setAirportTerminalEndTime(String AirportTerminalEndTime){
        this.AirportTerminalEndTime = AirportTerminalEndTime;
    }
    public String getAirportTerminalEndTime(){
        return this.AirportTerminalEndTime;
    }
    public void setAirportTerminalEffectiveDate(String AirportTerminalEffectiveDate){
        this.AirportTerminalEffectiveDate = AirportTerminalEffectiveDate;
    }
    public String getAirportTerminalEffectiveDate(){
        return this.AirportTerminalEffectiveDate;
    }
    public void setAirportTerminalEndDate(String AirportTerminalEndDate){
        this.AirportTerminalEndDate = AirportTerminalEndDate;
    }
    public String getAirportTerminalEndDate(){
        return this.AirportTerminalEndDate;
    }

    @Override
    public String toString() {
        return "AirportTerminals{" +
                "AirportTerminal='" + AirportTerminal + '\'' +
                ", IsDomesticInboundTerminal=" + IsDomesticInboundTerminal +
                ", IsDomesticOutboundTerminal=" + IsDomesticOutboundTerminal +
                ", IsInternationalInboundTerminal=" + IsInternationalInboundTerminal +
                ", IsInternationalOutboundTerminal=" + IsInternationalOutboundTerminal +
                ", AirportTerminalCommentText='" + AirportTerminalCommentText + '\'' +
                ", AirportTerminalStartTime='" + AirportTerminalStartTime + '\'' +
                ", AirportTerminalEndTime='" + AirportTerminalEndTime + '\'' +
                ", AirportTerminalEffectiveDate='" + AirportTerminalEffectiveDate + '\'' +
                ", AirportTerminalEndDate='" + AirportTerminalEndDate + '\'' +
                '}';
    }
}
