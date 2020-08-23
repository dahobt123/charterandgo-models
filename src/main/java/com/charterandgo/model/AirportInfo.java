package com.charterandgo.model;

import com.charterandgo.model.RunwayInfo;
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
        obj.put("city",city);
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
}
