package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cost implements Serializable {

    private String costType;
    private BigDecimal costAmountCalculated;
    private BigDecimal costAmountOverride;
    private String costCurrency;

    public Cost() {

    }

    public String toString() {
        return costType + "-" + costAmountCalculated + "-" + costCurrency;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("costType", costType);
        obj.put("costAmountCalculated", costAmountCalculated);
        obj.put("costAmountOverride", costAmountOverride);
        obj.put("costCurrency", costCurrency);
        return obj;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public BigDecimal getCostAmountCalculated() {
        return costAmountCalculated;
    }

    public void setCostAmountCalculated(BigDecimal costAmountCalculated) {
        this.costAmountCalculated = costAmountCalculated;
    }

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency;
    }

    public BigDecimal getCostAmountOverride() {
        return costAmountOverride;
    }

    public void setCostAmountOverride(BigDecimal costAmountOverride) {
        this.costAmountOverride = costAmountOverride;
    }
}
