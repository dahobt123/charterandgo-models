package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Request implements Serializable {

    private String flightattendant;
    private List<Journey> journey = new ArrayList<>();
    private List<Offer> options = new ArrayList<>();
    private List<Aircraft> aircraft = new ArrayList<>();

    public Request() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        obj.put("flightattendant", flightattendant);
        obj.put("journey", array);
        for (Journey jrny : journey) {
            array.put(jrny.toJson());
        }
        if (options.size() > 0) {
            System.out.println("In options toJSon");
            JSONArray optArray = new JSONArray();
            obj.put("options", optArray);
            for (Offer option : options) {
                optArray.put(option.toJson());
            }
        }
        if (aircraft.size() > 0) {
            JSONArray airArray = new JSONArray();
            for (Aircraft aircraft : aircraft) {
                airArray.put(aircraft.toJson());
            }
            obj.put("aircraft", airArray);
        }
        return obj;
    }

    public String toString() {
        System.out.println("In DetailRequest.toString");
        StringBuilder builder = new StringBuilder();
        for (Journey req : journey) {
            builder.append(req.toString() + "\n");
        }
        return builder.toString();
    }


    public List<Journey> getJourneyRequest() {
        return journey;
    }

    public void setJourneyRequest(List<Journey> journey) {
        this.journey = journey;
    }

    public List<Offer> getOptions() {
        return options;
    }

    public void setOptions(List<Offer> options) {
        this.options = options;
    }

    public String getFlightattendant() {
        return flightattendant;
    }

    public void setFlightattendant(String flightattendant) {
        this.flightattendant = flightattendant;
    }
}
