package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Journey implements Serializable {

    private String originairportcode;
    private String origincity;
    private String originstate;
    private String destinationairportcode;
    private String destinationcity;
    private String destinationstate;
    private String airporttype;
    private String date;
    private String time;

    public Journey() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("originairportcode", originairportcode);
        obj.put("origincity", origincity);
        obj.put("originstate", originstate);
        obj.put("destinationairportcode", destinationairportcode);
        obj.put("destinationcity", destinationcity);
        obj.put("destinationstate", destinationstate);
        obj.put("airporttype", airporttype);
        obj.put("date", date);
        obj.put("time", time);
        return obj;
    }

    public String toString() {
        return originairportcode + "-" + origincity + "-" + originstate + "-" +
                destinationairportcode + "-" +  destinationcity + "-" + destinationstate +
                "-" + airporttype + "-" + date + "-" + time + "\n";
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAirporttype() {
        return airporttype;
    }

    public void setAirporttype(String airporttype) {
        this.airporttype = airporttype;
    }
}
