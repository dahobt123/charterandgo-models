package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Journey implements Serializable {

    private String originairportcode;
    private String origincity;
    private String originstate;
    private String origincountry;
    private String destinationairportcode;
    private String destinationcity;
    private String destinationstate;
    private String destinationcountry;
    private String airporttype;
    private String aircrafttype;
    private String manufacturer;
    private String model;
    private String date;
    private String departuretime;
    private String arrivaltime;

    public Journey() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("originairportcode", originairportcode);
        obj.put("origincity", origincity);
        obj.put("originstate", originstate);
        obj.put("origincountry", origincountry);
        obj.put("destinationairportcode", destinationairportcode);
        obj.put("destinationcity", destinationcity);
        obj.put("destinationstate", destinationstate);
        obj.put("destinationcountry", destinationcountry);
        obj.put("airporttype", airporttype);
        obj.put("aircrafttype", aircrafttype);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("date", date);
        obj.put("departuretime", getDeparturetime());
        obj.put("arrivaltime", getArrivaltime());
        return obj;
    }

    public String toString() {
        return originairportcode + "-" + origincity + "-" + originstate + "-" + origincountry + "-" +
                destinationairportcode + "-" +  destinationcity + "-" + destinationstate + "-" + destinationcountry +
                "-" + airporttype + "-"+ aircrafttype + "-" + manufacturer + "-" + model + "-" + date + "-" + departuretime + "-" +
                arrivaltime + "\n";
    }

    public String getOriginairportcode() {
        return originairportcode;
    }

    public void setOriginairportcode(String originairportcode) {
        this.originairportcode = originairportcode;
    }

    public String getOrigincity() {
        return origincity;
    }

    public void setOrigincity(String origincity) {
        this.origincity = origincity;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public String getDestinationairportcode() {
        return destinationairportcode;
    }

    public void setDestinationairportcode(String destinationairportcode) {
        this.destinationairportcode = destinationairportcode;
    }

    public String getDestinationcity() {
        return destinationcity;
    }

    public void setDestinationcity(String destinationcity) {
        this.destinationcity = destinationcity;
    }

    public String getDestinationstate() {
        return destinationstate;
    }

    public void setDestinationstate(String destinationstate) {
        this.destinationstate = destinationstate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirporttype() {
        return airporttype;
    }

    public void setAirporttype(String airporttype) {
        this.airporttype = airporttype;
    }

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public String getDestinationcountry() {
        return destinationcountry;
    }

    public void setDestinationcountry(String destinationcountry) {
        this.destinationcountry = destinationcountry;
    }

    public String getAircrafttype() {
        return aircrafttype;
    }

    public void setAircrafttype(String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }
}
