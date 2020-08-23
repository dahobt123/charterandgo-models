package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class OfferItem implements Serializable {

    private int itemId;
    private String origin;
    private String destination;
    private BigDecimal mileage;
    private String segmentstatus;
    private String nnumber;
    private String chartersupplierid;
    private int traveltimeminutes;

    public OfferItem() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(itemId + "-");
        builder.append(origin + "-");
        builder.append(destination + "-");
        builder.append(segmentstatus + "-");
        builder.append(mileage + "-");
        builder.append(nnumber + "-");
        builder.append(chartersupplierid + "-");
        builder.append(traveltimeminutes + "-");
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("itemId",itemId);
        obj.put("origin", origin);
        obj.put("destination", destination);
        obj.put("segmentstatus", segmentstatus);
        obj.put("mileage", mileage);
        obj.put("nnumber", nnumber);
        obj.put("chartersupplierid", chartersupplierid);
        obj.put("traveltimeminutes", traveltimeminutes);
        return obj;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getSegmentstatus() {
        return segmentstatus;
    }

    public void setSegmentstatus(String segmentstatus) {
        this.segmentstatus = segmentstatus;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

    public String getChartersupplierid() {
        return chartersupplierid;
    }

    public void setChartersupplierid(String chartersupplierid) {
        this.chartersupplierid = chartersupplierid;
    }

    public int getTraveltimeminutes() {
        return traveltimeminutes;
    }

    public void setTraveltimeminutes(int traveltimeminutes) {
        this.traveltimeminutes = traveltimeminutes;
    }
}
