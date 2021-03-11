package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cargo implements Serializable {
    private int cargoitemId;
    private String measure;
    private BigDecimal weight;
    private BigDecimal lengthInchesOrCM;
    private BigDecimal widthInchesOrCM;
    private BigDecimal heightInchesOrCM;

    public Cargo() {

    }

    public String toString() {
        return Integer.toString(cargoitemId) + "-" + weight.toString() + "-" + lengthInchesOrCM.toString() + "-" +
                widthInchesOrCM.toString() + "-" + heightInchesOrCM.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("cargoitemid", cargoitemId);
        obj.put("weightpounds", weight);
        obj.put("lengthinches", lengthInchesOrCM);
        obj.put("widthinches", widthInchesOrCM);
        obj.put("heightinches", heightInchesOrCM);
        return obj;
    }

    public int getCargoitemId() {
        return cargoitemId;
    }

    public void setCargoitemId(int cargoitemId) {
        this.cargoitemId = cargoitemId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getLengthInchesOrCM() {
        return lengthInchesOrCM;
    }

    public void setLengthInchesOrCM(BigDecimal lengthInchesOrCM) {
        this.lengthInchesOrCM = lengthInchesOrCM;
    }

    public BigDecimal getWidthInchesOrCM() {
        return widthInchesOrCM;
    }

    public void setWidthInchesOrCM(BigDecimal widthInchesOrCM) {
        this.widthInchesOrCM = widthInchesOrCM;
    }

    public BigDecimal getHeightInchesOrCM() {
        return heightInchesOrCM;
    }

    public void setHeightInchesOrCM(BigDecimal heightInchesOrCM) {
        this.heightInchesOrCM = heightInchesOrCM;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
