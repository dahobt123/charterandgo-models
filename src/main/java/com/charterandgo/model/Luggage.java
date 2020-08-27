package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Luggage implements Serializable {
    private int luggageid;
    private String luggagetype;
    private int numberofpieces;

    public Luggage() {

    }

    public String toString() {
        return Integer.toString(luggageid) + "-" + luggagetype + "-" + Integer.toString(numberofpieces);
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("", luggageid);
        obj.put("", luggagetype);
        obj.put("", numberofpieces);
        return obj;
    }

    public int getLuggageid() {
        return luggageid;
    }

    public void setLuggageid(int luggageid) {
        this.luggageid = luggageid;
    }

    public String getLuggagetype() {
        return luggagetype;
    }

    public void setLuggagetype(String luggagetype) {
        this.luggagetype = luggagetype;
    }

    public int getNumberofpieces() {
        return numberofpieces;
    }

    public void setNumberofpieces(int numberofpieces) {
        this.numberofpieces = numberofpieces;
    }
}
