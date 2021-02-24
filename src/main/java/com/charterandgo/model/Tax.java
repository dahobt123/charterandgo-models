package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Tax implements Serializable {

    private String taxType;
    private String subType;
    private BigDecimal taxAmount;
    private String taxCurrency;
    private boolean isFee;

    public Tax() {

    }

    public String toString() {
        return taxType + "/" + taxAmount + "/" + taxCurrency + "/" + isFee;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("taxtype", taxType);
        obj.put("taxamount", taxAmount);
        obj.put("taxcurrency", taxCurrency);
        return obj;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxCurrency() {
        return taxCurrency;
    }

    public void setTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency;
    }

    public boolean isFee() {
        return isFee;
    }

    public void setFee(boolean fee) {
        isFee = fee;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
