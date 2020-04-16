package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Countries {

    @JsonProperty("CountryCode2")
    private String CountryCode2;
    @JsonProperty("CountryCode3")
    private String CountryCode3;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("CountryFullName")
    private String CountryFullName;
    @JsonProperty("CheckinAllowed")
    private boolean CheckinAllowed;
    @JsonProperty("ActiveFromDate")
    private String ActiveFromDate;
    @JsonProperty("ActiveToDate")
    private String ActiveToDate;
    @JsonProperty("RegionCodes")
    private List<String> RegionCodes;

    public void setCountryCode2(String CountryCode2){
        this.CountryCode2 = CountryCode2;
    }
    public String getCountryCode2(){
        return this.CountryCode2;
    }
    public void setCountryCode3(String CountryCode3){
        this.CountryCode3 = CountryCode3;
    }
    public String getCountryCode3(){
        return this.CountryCode3;
    }
    public void setCountryName(String CountryName){
        this.CountryName = CountryName;
    }
    public String getCountryName(){
        return this.CountryName;
    }
    public void setCountryFullName(String CountryFullName){
        this.CountryFullName = CountryFullName;
    }
    public String getCountryFullName(){
        return this.CountryFullName;
    }
    public void setCheckinAllowed(boolean CheckinAllowed){
        this.CheckinAllowed = CheckinAllowed;
    }
    public boolean getCheckinAllowed(){
        return this.CheckinAllowed;
    }
    public void setActiveFromDate(String ActiveFromDate){
        this.ActiveFromDate = ActiveFromDate;
    }
    public String getActiveFromDate(){
        return this.ActiveFromDate;
    }
    public void setActiveToDate(String ActiveToDate){
        this.ActiveToDate = ActiveToDate;
    }
    public String getActiveToDate(){
        return this.ActiveToDate;
    }
    public void setRegionCodes(List<String> RegionCodes){
        this.RegionCodes = RegionCodes;
    }
    public List<String> getRegionCodes(){
        return this.RegionCodes;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "CountryCode2='" + CountryCode2 + '\'' +
                ", CountryCode3='" + CountryCode3 + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", CountryFullName='" + CountryFullName + '\'' +
                ", CheckinAllowed=" + CheckinAllowed +
                ", ActiveFromDate='" + ActiveFromDate + '\'' +
                ", ActiveToDate='" + ActiveToDate + '\'' +
                ", RegionCodes=" + RegionCodes +
                '}';
    }
}
