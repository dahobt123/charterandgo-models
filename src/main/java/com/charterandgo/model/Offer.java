package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Offer implements Serializable {

    private int offerId;
    private int totalExpectedPassengers;
    private String warningTyoe;
    private String warningText;
    private List<OfferItem> offerItems = new ArrayList<>();
    private List<Price> pricing = new ArrayList<>();
    private JSONObject pricingNotes;
    private RunwayItem runway;
    private List<Tax> taxes = new ArrayList<>();
    private List<Aircraft> aircraft = new ArrayList<>();
    private ShopLists lists;
    private List<AirportInfo> airports = new ArrayList<>();

    public Offer() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offerId + "-");
        for (OfferItem item : offerItems) {
            builder.append(item.toString() + "/");
        }
        if (runway != null) {
            builder.append(runway.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offerId", offerId);
        JSONArray array = new JSONArray();
        obj.put("offerItems", array);
        for (OfferItem item : offerItems) {
            array.put(item.toJson());
        }
        if (pricing != null) {
            JSONArray priceArray = new JSONArray();
            for (Price price : pricing) {
                priceArray.put(price.toJson());
            }
            obj.put("pricing", priceArray);
        }
        if (pricingNotes != null) {
            obj.put("pricingNotes", pricingNotes);
        }
        if (runway != null) {
            obj.put("runway", runway.toJson());
        }
        JSONArray taxArray = new JSONArray();
        for (Tax tax : taxes) {
            taxArray.put(tax.toJson());
        }
        obj.put("taxes", taxArray);
        JSONArray aircrafts = new JSONArray();
        for (Aircraft ac : aircraft) {
            aircrafts.put(ac.toJson());
        }
        obj.put("aircraft", aircrafts);
        return obj;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public List<OfferItem> getOfferItems() {
        return offerItems;
    }

    public void setOfferItems(List<OfferItem> offerItems) {
        this.offerItems = offerItems;
    }

    public RunwayItem getRunway() {
        return runway;
    }

    public void setRunway(RunwayItem runway) {
        this.runway = runway;
    }

    public List<Price> getPricing() {
        return pricing;
    }

    public void setPricing(List<Price> pricing) {
        this.pricing = pricing;
    }

    public void setTaxes(List<Tax> taxList) {
        this.taxes = taxList;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public String getWarningTyoe() {
        return warningTyoe;
    }

    public void setWarningTyoe(String warningTyoe) {
        this.warningTyoe = warningTyoe;
    }

    public String getWarningText() {
        return warningText;
    }

    public void setWarningText(String warningText) {
        this.warningText = warningText;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public ShopLists getLists() {
        return lists;
    }

    public void setLists(ShopLists lists) {
        this.lists = lists;
    }

    public List<AirportInfo> getAirports() {
        return airports;
    }

    public void setAirports(List<AirportInfo> airports) {
        this.airports = airports;
    }

    public int getTotalExpectedPassengers() {
        return totalExpectedPassengers;
    }

    public void setTotalExpectedPassengers(int totalExpectedPassengers) {
        this.totalExpectedPassengers = totalExpectedPassengers;
    }

    public JSONObject getPricingNotes() {
        return pricingNotes;
    }

    public void setPricingNotes(JSONObject pricingNotes) {
        this.pricingNotes = pricingNotes;
    }
}
