package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirportResponse {
    @JsonProperty("Code")
    private String Code;
    @JsonProperty("City")
    private String City;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("DefaultDisplayName")
    private String DefaultDisplayName;
    @JsonProperty("StateCode")
    private String StateCode;
    @JsonProperty("CountryCode")
    private String CountryCode;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("IsBlueCity")
    private Boolean IsBlueCity;
    @JsonProperty("IsPreClearedStation")
    private Boolean IsPreClearedStation;
    @JsonProperty("IsMACCode")
    private Boolean IsMACCode;
    @JsonProperty("ParentMACCode")
    private String ParentMACCode;
    @JsonProperty("ChildrenMACCodes")
    private List<String> ChildrenMACCodes;
    @JsonProperty("regionCodes")
    private List<String> RegionCodes;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDefaultDisplayName() {
        return DefaultDisplayName;
    }

    public void setDefaultDisplayName(String defaultDisplayName) {
        DefaultDisplayName = defaultDisplayName;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public Boolean getBlueCity() {
        return IsBlueCity;
    }

    public void setBlueCity(Boolean blueCity) {
        IsBlueCity = blueCity;
    }

    public Boolean getPreClearedStation() {
        return IsPreClearedStation;
    }

    public void setPreClearedStation(Boolean preClearedStation) {
        IsPreClearedStation = preClearedStation;
    }

    public Boolean getMACCode() {
        return IsMACCode;
    }

    public void setMACCode(Boolean MACCode) {
        IsMACCode = MACCode;
    }

    public String getParentMACCode() {
        return ParentMACCode;
    }

    public void setParentMACCode(String parentMACCode) {
        ParentMACCode = parentMACCode;
    }

    public List<String> getChildrenMACCodes() {
        return ChildrenMACCodes;
    }

    public void setChildrenMACCodes(List<String> childrenMACCodes) {
        ChildrenMACCodes = childrenMACCodes;
    }

    public List<String> getRegionCodes() {
        return RegionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        RegionCodes = regionCodes;
    }

    @Override
    public String toString() {
        return "AirportResponse{" +
                "Code='" + Code + '\'' +
                ", City='" + City + '\'' +
                ", Name='" + Name + '\'' +
                ", DefaultDisplayName='" + DefaultDisplayName + '\'' +
                ", StateCode='" + StateCode + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", IsBlueCity=" + IsBlueCity +
                ", IsPreClearedStation=" + IsPreClearedStation +
                ", IsMACCode=" + IsMACCode +
                ", ParentMACCode='" + ParentMACCode + '\'' +
                ", ChildrenMACCodes=" + ChildrenMACCodes +
                ", RegionCodes=" + RegionCodes +
                '}';
    }
}
