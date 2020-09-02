package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cost implements Serializable {

    private String costtype;
    private BigDecimal costamount;
    private String costcurrency;

    public Cost() {

    }

    public String toString() {
        return costtype + "-" + costamount + "-" + costcurrency;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("costtype", costtype);
        obj.put("priceamount", costamount);
        obj.put("pricecurrency", costcurrency);
        return obj;
    }

    public String getCosttype() {
        return costtype;
    }

    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    public BigDecimal getCostamount() {
        return costamount;
    }

    public void setCostamount(BigDecimal costamount) {
        this.costamount = costamount;
    }

    public String getCostcurrency() {
        return costcurrency;
    }

    public void setCostcurrency(String costcurrency) {
        this.costcurrency = costcurrency;
    }
}
