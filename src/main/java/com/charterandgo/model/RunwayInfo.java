package com.charterandgo.model;

import org.json.JSONObject;

import java.math.BigDecimal;

public class RunwayInfo {

    private String runwayId;
    private String runwayType;
    private int runwayLength;
    private int runwayWidth;
    private String runwaySurfaceTypeCondition;
    private String runwaySurfaceTreatment;
    private String runwayObstacle;
    private BigDecimal baseEndPhysicalElevation;
    private String baseEndALS;
    private BigDecimal runwayWeightBearingCapacitySW;
    private BigDecimal runwayWeightBearingCapacityDW;
    private BigDecimal runwayWeightBearingCapacityDT;

    public RunwayInfo() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("runwayId",runwayId);
        obj.put("runwayType",runwayType);
        obj.put("runwayLength",runwayLength);
        obj.put("runwayWidth",runwayWidth);
        obj.put("runwayObstacle",runwayObstacle);
        obj.put("runwaySurfaceTypeCondition",runwaySurfaceTypeCondition);
        obj.put("runwaySurfaceTreatment",runwaySurfaceTreatment);
        obj.put("baseEndPhysicalElevation",baseEndPhysicalElevation);
        obj.put("baseEndALS",baseEndALS);
        obj.put("runwayWeightBearingCapacitySW",runwayWeightBearingCapacitySW);
        obj.put("runwayWeightBearingCapacityDW",runwayWeightBearingCapacityDW);
        obj.put("runwayWeightBearingCapacityDT",runwayWeightBearingCapacityDT);
        return obj;
    }

    public String getRunwayId() {
        return runwayId;
    }

    public void setRunwayId(String runwayId) {
        this.runwayId = runwayId;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    public int getRunwayWidth() {
        return runwayWidth;
    }

    public void setRunwayWidth(int runwayWidth) {
        this.runwayWidth = runwayWidth;
    }

    public String getRunwaySurfaceTypeCondition() {
        return runwaySurfaceTypeCondition;
    }

    public void setRunwaySurfaceTypeCondition(String runwaySurfaceTypeCondition) {
        this.runwaySurfaceTypeCondition = runwaySurfaceTypeCondition;
    }

    public String getRunwaySurfaceTreatment() {
        return runwaySurfaceTreatment;
    }

    public void setRunwaySurfaceTreatment(String runwaySurfaceTreatment) {
        this.runwaySurfaceTreatment = runwaySurfaceTreatment;
    }

    public BigDecimal getBaseEndPhysicalElevation() {
        return baseEndPhysicalElevation;
    }

    public void setBaseEndPhysicalElevation(BigDecimal baseEndPhysicalElevation) {
        this.baseEndPhysicalElevation = baseEndPhysicalElevation;
    }

    public String getBaseEndALS() {
        return baseEndALS;
    }

    public void setBaseEndALS(String baseEndALS) {
        this.baseEndALS = baseEndALS;
    }

    public BigDecimal getRunwayWeightBearingCapacitySW() {
        return runwayWeightBearingCapacitySW;
    }

    public void setRunwayWeightBearingCapacitySW(BigDecimal runwayWeightBearingCapacitySW) {
        this.runwayWeightBearingCapacitySW = runwayWeightBearingCapacitySW;
    }

    public BigDecimal getRunwayWeightBearingCapacityDW() {
        return runwayWeightBearingCapacityDW;
    }

    public void setRunwayWeightBearingCapacityDW(BigDecimal runwayWeightBearingCapacityDW) {
        this.runwayWeightBearingCapacityDW = runwayWeightBearingCapacityDW;
    }

    public BigDecimal getRunwayWeightBearingCapacityDT() {
        return runwayWeightBearingCapacityDT;
    }

    public void setRunwayWeightBearingCapacityDT(BigDecimal runwayWeightBearingCapacityDT) {
        this.runwayWeightBearingCapacityDT = runwayWeightBearingCapacityDT;
    }

    public String getRunwayType() {
        return runwayType;
    }

    public void setRunwayType(String runwayType) {
        this.runwayType = runwayType;
    }

    public String getRunwayObstacle() {
        return runwayObstacle;
    }

    public void setRunwayObstacle(String runwayObstacle) {
        this.runwayObstacle = runwayObstacle;
    }
}
