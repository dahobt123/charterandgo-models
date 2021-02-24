package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Offer implements Serializable {

    private int offerId;
    private String warningTyoe;
    private String warningText;
    private List<OfferItem> offerItems = new ArrayList<>();
    private OfferPrice pricing;
    private RunwayItem runway;
    private List<Tax> taxes = new ArrayList<>();

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
}
