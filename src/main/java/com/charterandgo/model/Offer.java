package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Offer implements Serializable {

    private int offerid;
    private List<OfferItem> offeritems = new ArrayList<>();
    private OfferPrice pricing;
    private RunwayItem runway;
    private List<Tax> taxes = new ArrayList<>();

    public Offer() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offerid + "-");
        for (OfferItem item : offeritems) {
            builder.append(item.toString() + "/");
        }
        if (runway != null) {
            builder.append(runway.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offerid", offerid);
        JSONArray array = new JSONArray();
        obj.put("offeritems", array);
        for (OfferItem item : offeritems) {
            array.put(item.toJson());
        }
        if (pricing != null) {
            obj.put("pricing", pricing.toJson());
        }
        if (runway != null) {
            obj.put("runway", runway.toJson());
        }
        JSONArray taxArray = new JSONArray();
        for (Tax tax : taxes) {
            taxArray.put(tax.toJson());
        }
        obj.put("taxes", taxArray);
        return obj;
    }

    public int getOfferid() {
        return offerid;
    }

    public void setOfferid(int offerid) {
        this.offerid = offerid;
    }

    public List<OfferItem> getOfferitems() {
        return offeritems;
    }

    public void setOfferitems(List<OfferItem> offeritems) {
        this.offeritems = offeritems;
    }

    public RunwayItem getRunway() {
        return runway;
    }

    public void setRunway(RunwayItem runway) {
        this.runway = runway;
    }

    public OfferPrice getPricing() {
        return pricing;
    }

    public void setPricing(OfferPrice pricing) {
        this.pricing = pricing;
    }

    public void setTaxes(List<Tax> taxList) {
        this.taxes = taxList;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }
}
