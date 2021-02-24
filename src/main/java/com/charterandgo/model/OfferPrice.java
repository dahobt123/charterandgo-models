package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OfferPrice  implements Serializable {

    private String priceGuaranteeTimeLimit;
    private String paymentDateTime;
    private List<Price> prices = new ArrayList<>();

    public OfferPrice() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(priceGuaranteeTimeLimit + " - ");
        builder.append(paymentDateTime + " - ");
        for (Price price : prices) {
            builder.append(price.toString() + " - ");
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("priceguaranteetimelimit", priceGuaranteeTimeLimit);
        obj.put("paymentdatetime", paymentDateTime);
        JSONArray array = new JSONArray();
        for (Price price : prices) {
            array.put(price.toJson());
        }
        obj.put("prices", array);
        return obj;
    }

    public String getPriceGuaranteeTimeLimit() {
        return priceGuaranteeTimeLimit;
    }

    public void setPriceGuaranteeTimeLimit(String priceGuaranteeTimeLimit) {
        this.priceGuaranteeTimeLimit = priceGuaranteeTimeLimit;
    }

    public String getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(String paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
