package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Luggage implements Serializable {
    private int luggageId;
    private String luggageType;
    private int numberOfPieces;

    public Luggage() {

    }

    public String toString() {
        return Integer.toString(luggageId) + "-" + luggageType + "-" + Integer.toString(numberOfPieces);
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("", luggageId);
        obj.put("", luggageType);
        obj.put("", numberOfPieces);
        return obj;
    }

    public int getLuggageId() {
        return luggageId;
    }

    public void setLuggageId(int luggageId) {
        this.luggageId = luggageId;
    }

    public String getLuggageType() {
        return luggageType;
    }

    public void setLuggageType(String luggageType) {
        this.luggageType = luggageType;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
}
