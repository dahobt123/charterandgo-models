package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OfferPrice  implements Serializable {

    private String priceguaranteetimelimit;
    private String paymentdatetime;
    private List<Price> prices = new ArrayList<>();

    public OfferPrice() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(priceguaranteetimelimit + " - ");
        builder.append(paymentdatetime + " - ");
        for (Price price : prices) {
            builder.append(price.toString() + " - ");
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("priceguaranteetimelimit",priceguaranteetimelimit );
        obj.put("paymentdatetime", paymentdatetime);
        JSONArray array = new JSONArray();
        for (Price price : prices) {
            array.put(price.toJson());
        }
        obj.put("prices", array);
        return obj;
    }

    public String getPriceguaranteetimelimit() {
        return priceguaranteetimelimit;
    }

    public void setPriceguaranteetimelimit(String priceguaranteetimelimit) {
        this.priceguaranteetimelimit = priceguaranteetimelimit;
    }

    public String getPaymentdatetime() {
        return paymentdatetime;
    }

    public void setPaymentdatetime(String paymentdatetime) {
        this.paymentdatetime = paymentdatetime;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
