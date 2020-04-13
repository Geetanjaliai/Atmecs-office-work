package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Airports {

    @JsonProperty("IATAAirportCode")
    private String IATAAirportCode;
    @JsonProperty("IATAAirportName")
    private String IATAAirportName;
    @JsonProperty("ICAOAirportCode")
    private String ICAOAirportCode;
    @JsonProperty("ICAOAirportName")
    private String ICAOAirportName;
    @JsonProperty("WSILocationCode")
    private String WSILocationCode;
    @JsonProperty("MetropolitanAreaCode")
    private String MetropolitanAreaCode;
    @JsonProperty("MetropolitanAreaName")
    private String MetropolitanAreaName;
    @JsonProperty("AirportShortDisplayName")
    private String AirportShortDisplayName;
    @JsonProperty("AirportLongDisplayName")
    private String AirportLongDisplayName;
    @JsonProperty("AirportTypeCode")
    private String AirportTypeCode;
    @JsonProperty("AirportTypeName")
    private String AirportTypeName;
    @JsonProperty("AirportTypeDesc")
    private String AirportTypeDesc;
    @JsonProperty("TravelStartDate")
    private String TravelStartDate;
    @JsonProperty("BookingStartDate")
    private String BookingStartDate;
    @JsonProperty("IsActive")
    private boolean IsActive;
    @JsonProperty("IsJetBlue")
    private boolean IsJetBlue;
    @JsonProperty("IsInterline")
    private boolean IsInterline;
    @JsonProperty("IsCodeShare")
    private boolean IsCodeShare;
    @JsonProperty("IsPreClearedDestination")
    private boolean IsPreClearedDestination;
    @JsonProperty("Latitude")
    private String Latitude;
    @JsonProperty("Longitude")
    private String Longitude;
    @JsonProperty("CityCode")
    private String CityCode;
    @JsonProperty("CityName")
    private String CityName;
    @JsonProperty("CityDescription")
    private String CityDescription;
    @JsonProperty("StateCode")
    private String StateCode;
    @JsonProperty("StateName")
    private String StateName;
    @JsonProperty("StateDescription")
    private String StateDescription;
    @JsonProperty("CountryCode2")
    private String CountryCode2;
    @JsonProperty("TimezoneCode")
    private String TimezoneCode;
    @JsonProperty("TimezoneName")
    private String TimezoneName;
    @JsonProperty("StandardTimezoneVariance")
    private String StandardTimezoneVariance;
    @JsonProperty("DSTTimezoneVariance")
    private String DSTTimezoneVariance;
    @JsonProperty("DSTStartDate")
    private String DSTStartDate;
    @JsonProperty("DSTEndDate")
    private String DSTEndDate;
    @JsonProperty("AirportTerminals")
    private List<AirportTerminals> AirportTerminals;

    public void setIATAAirportCode(String IATAAirportCode){
        this.IATAAirportCode = IATAAirportCode;
    }
    public String getIATAAirportCode(){
        return this.IATAAirportCode;
    }
    public void setIATAAirportName(String IATAAirportName){
        this.IATAAirportName = IATAAirportName;
    }
    public String getIATAAirportName(){
        return this.IATAAirportName;
    }
    public void setICAOAirportCode(String ICAOAirportCode){
        this.ICAOAirportCode = ICAOAirportCode;
    }
    public String getICAOAirportCode(){
        return this.ICAOAirportCode;
    }
    public void setICAOAirportName(String ICAOAirportName){
        this.ICAOAirportName = ICAOAirportName;
    }
    public String getICAOAirportName(){
        return this.ICAOAirportName;
    }
    public void setWSILocationCode(String WSILocationCode){
        this.WSILocationCode = WSILocationCode;
    }
    public String getWSILocationCode(){
        return this.WSILocationCode;
    }
    public void setMetropolitanAreaCode(String MetropolitanAreaCode){
        this.MetropolitanAreaCode = MetropolitanAreaCode;
    }
    public String getMetropolitanAreaCode(){
        return this.MetropolitanAreaCode;
    }
    public void setMetropolitanAreaName(String MetropolitanAreaName){
        this.MetropolitanAreaName = MetropolitanAreaName;
    }
    public String getMetropolitanAreaName(){
        return this.MetropolitanAreaName;
    }
    public void setAirportShortDisplayName(String AirportShortDisplayName){
        this.AirportShortDisplayName = AirportShortDisplayName;
    }
    public String getAirportShortDisplayName(){
        return this.AirportShortDisplayName;
    }
    public void setAirportLongDisplayName(String AirportLongDisplayName){
        this.AirportLongDisplayName = AirportLongDisplayName;
    }
    public String getAirportLongDisplayName(){
        return this.AirportLongDisplayName;
    }
    public void setAirportTypeCode(String AirportTypeCode){
        this.AirportTypeCode = AirportTypeCode;
    }
    public String getAirportTypeCode(){
        return this.AirportTypeCode;
    }
    public void setAirportTypeName(String AirportTypeName){
        this.AirportTypeName = AirportTypeName;
    }
    public String getAirportTypeName(){
        return this.AirportTypeName;
    }
    public void setAirportTypeDesc(String AirportTypeDesc){
        this.AirportTypeDesc = AirportTypeDesc;
    }
    public String getAirportTypeDesc(){
        return this.AirportTypeDesc;
    }
    public void setTravelStartDate(String TravelStartDate){
        this.TravelStartDate = TravelStartDate;
    }
    public String getTravelStartDate(){
        return this.TravelStartDate;
    }
    public void setBookingStartDate(String BookingStartDate){
        this.BookingStartDate = BookingStartDate;
    }
    public String getBookingStartDate(){
        return this.BookingStartDate;
    }
    public void setIsActive(boolean IsActive){
        this.IsActive = IsActive;
    }
    public boolean getIsActive(){
        return this.IsActive;
    }
    public void setIsJetBlue(boolean IsJetBlue){
        this.IsJetBlue = IsJetBlue;
    }
    public boolean getIsJetBlue(){
        return this.IsJetBlue;
    }
    public void setIsInterline(boolean IsInterline){
        this.IsInterline = IsInterline;
    }
    public boolean getIsInterline(){
        return this.IsInterline;
    }
    public void setIsCodeShare(boolean IsCodeShare){
        this.IsCodeShare = IsCodeShare;
    }
    public boolean getIsCodeShare(){
        return this.IsCodeShare;
    }
    public void setIsPreClearedDestination(boolean IsPreClearedDestination){
        this.IsPreClearedDestination = IsPreClearedDestination;
    }
    public boolean getIsPreClearedDestination(){
        return this.IsPreClearedDestination;
    }
    public void setLatitude(String Latitude){
        this.Latitude = Latitude;
    }
    public String getLatitude(){
        return this.Latitude;
    }
    public void setLongitude(String Longitude){
        this.Longitude = Longitude;
    }
    public String getLongitude(){
        return this.Longitude;
    }
    public void setCityCode(String CityCode){
        this.CityCode = CityCode;
    }
    public String getCityCode(){
        return this.CityCode;
    }
    public void setCityName(String CityName){
        this.CityName = CityName;
    }
    public String getCityName(){
        return this.CityName;
    }
    public void setCityDescription(String CityDescription){
        this.CityDescription = CityDescription;
    }
    public String getCityDescription(){
        return this.CityDescription;
    }
    public void setStateCode(String StateCode){
        this.StateCode = StateCode;
    }
    public String getStateCode(){
        return this.StateCode;
    }
    public void setStateName(String StateName){
        this.StateName = StateName;
    }
    public String getStateName(){
        return this.StateName;
    }
    public void setStateDescription(String StateDescription){
        this.StateDescription = StateDescription;
    }
    public String getStateDescription(){
        return this.StateDescription;
    }
    public void setCountryCode2(String CountryCode2){
        this.CountryCode2 = CountryCode2;
    }
    public String getCountryCode2(){
        return this.CountryCode2;
    }
    public void setTimezoneCode(String TimezoneCode){
        this.TimezoneCode = TimezoneCode;
    }
    public String getTimezoneCode(){
        return this.TimezoneCode;
    }
    public void setTimezoneName(String TimezoneName){
        this.TimezoneName = TimezoneName;
    }
    public String getTimezoneName(){
        return this.TimezoneName;
    }
    public void setStandardTimezoneVariance(String StandardTimezoneVariance){
        this.StandardTimezoneVariance = StandardTimezoneVariance;
    }
    public String getStandardTimezoneVariance(){
        return this.StandardTimezoneVariance;
    }
    public void setDSTTimezoneVariance(String DSTTimezoneVariance){
        this.DSTTimezoneVariance = DSTTimezoneVariance;
    }
    public String getDSTTimezoneVariance(){
        return this.DSTTimezoneVariance;
    }
    public void setDSTStartDate(String DSTStartDate){
        this.DSTStartDate = DSTStartDate;
    }
    public String getDSTStartDate(){
        return this.DSTStartDate;
    }
    public void setDSTEndDate(String DSTEndDate){
        this.DSTEndDate = DSTEndDate;
    }
    public String getDSTEndDate(){
        return this.DSTEndDate;
    }
    public void setAirportTerminals(List<AirportTerminals> AirportTerminals){
        this.AirportTerminals = AirportTerminals;
    }
    public List<AirportTerminals> getAirportTerminals(){
        return this.AirportTerminals;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "IATAAirportCode='" + IATAAirportCode + '\'' +
                ", IATAAirportName='" + IATAAirportName + '\'' +
                ", ICAOAirportCode='" + ICAOAirportCode + '\'' +
                ", ICAOAirportName='" + ICAOAirportName + '\'' +
                ", WSILocationCode='" + WSILocationCode + '\'' +
                ", MetropolitanAreaCode='" + MetropolitanAreaCode + '\'' +
                ", MetropolitanAreaName='" + MetropolitanAreaName + '\'' +
                ", AirportShortDisplayName='" + AirportShortDisplayName + '\'' +
                ", AirportLongDisplayName='" + AirportLongDisplayName + '\'' +
                ", AirportTypeCode='" + AirportTypeCode + '\'' +
                ", AirportTypeName='" + AirportTypeName + '\'' +
                ", AirportTypeDesc='" + AirportTypeDesc + '\'' +
                ", TravelStartDate='" + TravelStartDate + '\'' +
                ", BookingStartDate='" + BookingStartDate + '\'' +
                ", IsActive=" + IsActive +
                ", IsJetBlue=" + IsJetBlue +
                ", IsInterline=" + IsInterline +
                ", IsCodeShare=" + IsCodeShare +
                ", IsPreClearedDestination=" + IsPreClearedDestination +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", CityCode='" + CityCode + '\'' +
                ", CityName='" + CityName + '\'' +
                ", CityDescription='" + CityDescription + '\'' +
                ", StateCode='" + StateCode + '\'' +
                ", StateName='" + StateName + '\'' +
                ", StateDescription='" + StateDescription + '\'' +
                ", CountryCode2='" + CountryCode2 + '\'' +
                ", TimezoneCode='" + TimezoneCode + '\'' +
                ", TimezoneName='" + TimezoneName + '\'' +
                ", StandardTimezoneVariance='" + StandardTimezoneVariance + '\'' +
                ", DSTTimezoneVariance='" + DSTTimezoneVariance + '\'' +
                ", DSTStartDate='" + DSTStartDate + '\'' +
                ", DSTEndDate='" + DSTEndDate + '\'' +
                ", AirportTerminals=" + AirportTerminals +
                '}';
    }
}
