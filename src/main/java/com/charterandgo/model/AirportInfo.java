package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AirportInfo {

    private String siteNumber;
    private String locId;
    private BigDecimal airportLatitude;
    private BigDecimal airportLongitude;
    private String state;
    private String city;
    private String country;
    private String icaoCode;
    private int cityRating;
    private String ownerName;
    private String ownerPhone;
    private String airportName;
    private int departTaxiTime;
    private int arriveTaxiTime;
    private List<RunwayInfo> runways = new ArrayList<>();
    private List<AirportFacilitiesInfo> fbos = new ArrayList<>();

    public AirportInfo() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("siteNumber",siteNumber);
        obj.put("locId",locId);
        obj.put("airportLatitude",airportLatitude);
        obj.put("airportLongitude",airportLongitude);
        obj.put("state",state);
        obj.put("country",country);
        obj.put("city",city);
        obj.put("icaoCode",icaoCode);
        obj.put("departTaxiTime",departTaxiTime);
        obj.put("arriveTaxiTime",arriveTaxiTime);
        JSONArray runwayArray = new JSONArray();
        for (RunwayInfo info : runways) {
            runwayArray.put(info.toJson());
        }
        obj.put("runways", runwayArray);
        JSONArray fboArray = new JSONArray();
        for (AirportFacilitiesInfo info : fbos) {
            fboArray.put(info.toJson());
        }
        obj.put("facilities", fboArray);
        return obj;
    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public BigDecimal getAirportLatitude() {
        return airportLatitude;
    }

    public void setAirportLatitude(BigDecimal airportLatitude) {
        this.airportLatitude = airportLatitude;
    }

    public BigDecimal getAirportLongitude() {
        return airportLongitude;
    }

    public void setAirportLongitude(BigDecimal airportLongitude) {
        this.airportLongitude = airportLongitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<RunwayInfo> getRunways() {
        return runways;
    }

    public void setRunways(List<RunwayInfo> runways) {
        this.runways = runways;
    }

    public void addRunway(RunwayInfo info) {
        this.runways.add(info);
    }

    public List<AirportFacilitiesInfo> getFbos() {
        return fbos;
    }

    public void setFbos(List<AirportFacilitiesInfo> fbos) {
        this.fbos = fbos;
    }
    public void addFbo(AirportFacilitiesInfo info) {
        this.fbos.add(info);
    }

    public int getCityRating() {
        return cityRating;
    }

    public void setCityRating(int cityRating) {
        this.cityRating = cityRating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public int getDepartTaxiTime() {
        return departTaxiTime;
    }

    public void setDepartTaxiTime(int departTaxiTime) {
        this.departTaxiTime = departTaxiTime;
    }

    public int getArriveTaxiTime() {
        return arriveTaxiTime;
    }

    public void setArriveTaxiTime(int arriveTaxiTime) {
        this.arriveTaxiTime = arriveTaxiTime;
    }

}
