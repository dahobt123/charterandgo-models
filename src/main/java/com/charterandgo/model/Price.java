package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Price  implements Serializable {
    private String priceType;
    private BigDecimal priceAmountCalculated;
    private BigDecimal priceAmountOverRidden;
    private String priceCurrency;

    public Price() {

    }

    public String toString() {
        return priceType + "-" + priceAmountCalculated.toString() + "-" + priceCurrency;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("priceType", priceType);
        obj.put("priceAmountCalculated", priceAmountCalculated);
        obj.put("priceAmountOverRidden", priceAmountOverRidden);
        obj.put("priceCurrency", priceCurrency);
        return obj;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getPriceAmountCalculated() {
        return priceAmountCalculated;
    }

    public void setPriceAmountCalculated(BigDecimal priceAmountCalculated) {
        this.priceAmountCalculated = priceAmountCalculated;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public BigDecimal getPriceAmountOverRidden() {
        return priceAmountOverRidden;
    }

    public void setPriceAmountOverRidden(BigDecimal priceAmountOverRidden) {
        this.priceAmountOverRidden = priceAmountOverRidden;
    }
}
