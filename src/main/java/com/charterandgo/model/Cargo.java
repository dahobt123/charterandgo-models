package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cargo implements Serializable {
    private int cargoitemid;
    private BigDecimal weightpounds;
    private BigDecimal lengthinches;
    private BigDecimal widthinches;
    private BigDecimal heightinches;
    public Cargo() {

    }

    public String toString() {
        return Integer.toString(cargoitemid) + "-" + weightpounds.toString() + "-" + lengthinches.toString() + "-" +
                widthinches.toString() + "-" + heightinches.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("cargoitemid", cargoitemid);
        obj.put("weightpounds", weightpounds);
        obj.put("lengthinches", lengthinches);
        obj.put("widthinches", widthinches);
        obj.put("heightinches", heightinches);
        return obj;
    }

    public int getCargoitemid() {
        return cargoitemid;
    }

    public void setCargoitemid(int cargoitemid) {
        this.cargoitemid = cargoitemid;
    }

    public BigDecimal getWeightpounds() {
        return weightpounds;
    }

    public void setWeightpounds(BigDecimal weightpounds) {
        this.weightpounds = weightpounds;
    }

    public BigDecimal getLengthinches() {
        return lengthinches;
    }

    public void setLengthinches(BigDecimal lengthinches) {
        this.lengthinches = lengthinches;
    }

    public BigDecimal getWidthinches() {
        return widthinches;
    }

    public void setWidthinches(BigDecimal widthinches) {
        this.widthinches = widthinches;
    }

    public BigDecimal getHeightinches() {
        return heightinches;
    }

    public void setHeightinches(BigDecimal heightinches) {
        this.heightinches = heightinches;
    }
}
