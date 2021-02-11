package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AirportShopData {

    private String airport;
    private List<AirportShopDetails> fbos = new ArrayList<>();

    public AirportShopData() {}

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("airport", airport);
        JSONArray array = new JSONArray();
        for (AirportShopDetails details: fbos){
            array.put(details.toJson());
        }
        obj.put("fbos", array);
        return obj;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public List<AirportShopDetails> getFbos() {
        return fbos;
    }

    public void setFbos(List<AirportShopDetails> fbos) {
        this.fbos = fbos;
    }
}
