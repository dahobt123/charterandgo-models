package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cost implements Serializable {

    private String costtype;
    private BigDecimal priceamount;
    private String pricecurrency;

    public Cost() {

    }

    public String toString() {
        return costtype + "-" + priceamount + "-" + pricecurrency;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("costtype", costtype);
        obj.put("priceamount", priceamount);
        obj.put("pricecurrency", pricecurrency);
        return obj;
    }

    public String getCosttype() {
        return costtype;
    }

    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    public BigDecimal getPriceamount() {
        return priceamount;
    }

    public void setPriceamount(BigDecimal priceamount) {
        this.priceamount = priceamount;
    }

    public String getPricecurrency() {
        return pricecurrency;
    }

    public void setPricecurrency(String pricecurrency) {
        this.pricecurrency = pricecurrency;
    }
}
