package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JourneyOption implements Serializable {

    private int offerId;
    private List<OfferItem> offeritems = new ArrayList<>();

    public JourneyOption() {

    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offerId + "-");
        for (OfferItem item : offeritems) {
            builder.append(item.toString() + "/");
        }

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
}
