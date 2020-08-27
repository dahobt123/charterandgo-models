package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Tax implements Serializable {

    private String taxtype;
    private BigDecimal taxamount;
    private String taxcurrency;

    public Tax() {

    }

    public String toString() {
        return taxtype + "-" + taxamount + "-" + taxcurrency;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("taxtype", taxtype);
        obj.put("taxamount", taxamount);
        obj.put("taxcurrency", taxcurrency);
        return obj;
    }

    public String getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public String getTaxcurrency() {
        return taxcurrency;
    }

    public void setTaxcurrency(String taxcurrency) {
        this.taxcurrency = taxcurrency;
    }
}
