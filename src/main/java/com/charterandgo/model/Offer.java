package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Offer implements Serializable {

    private int offerId;
    private List<OfferItem> offeritems = new ArrayList<>();
    private OfferPrice pricing;
    private RunwayItem runway;
    private List<Tax> taxes = new ArrayList<>();

    public Offer() {

    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offerId + "-");
        for (OfferItem item : offeritems) {
            builder.append(item.toString() + "/");
        }
        builder.append(runway.toString());
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offerId", offerId);
        JSONArray array = new JSONArray();
        obj.put("offeritems", array);
        for (OfferItem item : offeritems) {
            array.put(item.toJson());
        }
        obj.put("pricing", pricing.toJson());
        JSONArray taxArray = new JSONArray();
        for (Tax tax : taxes) {
            taxArray.put(tax.toJson());
        }
        obj.put("taxes", taxArray);
        return obj;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
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
}
