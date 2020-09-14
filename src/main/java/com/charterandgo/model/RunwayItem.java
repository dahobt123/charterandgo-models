package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;

public class RunwayItem implements Serializable {

    private int runwaylengthlb;
    private int runwaywidthlb;
    private String runwayobstaclelb;
    private String runwaysurfacetypeconditionlb;
    private String runwaysurfacetreatmentlb;
    private BigDecimal baseendphysicalrlevationlb;
    private String baseendalslb;
    private BigDecimal runwayweightbearingcapacityswlb;
    private BigDecimal runwayweightbearingcapacitydwlb;
    private BigDecimal runwayweightbearingcapacitydtlb;

    public RunwayItem() {

    }

    public String toString() {
        return Integer.toString(runwaylengthlb) + "-" + Integer.toString(runwaywidthlb) + "-" +
                runwayobstaclelb + "-" + runwaysurfacetypeconditionlb + "-" + runwaysurfacetreatmentlb + "-" +
                baseendphysicalrlevationlb + "-" + baseendalslb + "-" + runwayweightbearingcapacityswlb
                + "-" + runwayweightbearingcapacitydwlb + "-" + runwayweightbearingcapacitydtlb;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("runwaylengthlb", runwaylengthlb);
        obj.put("runwaywidthlb", runwaywidthlb);
        obj.put("runwayobstaclelb", runwayobstaclelb);
        obj.put("runwaysurfacetypeconditionlb", runwaysurfacetypeconditionlb);
        obj.put("runwaysurfacetreatmentlb", runwaysurfacetreatmentlb);
        obj.put("baseendphysicalelevationlb", baseendphysicalrlevationlb);
        obj.put("baseendalslb", baseendalslb);
        obj.put("runwayweightbearingcapacityswlb", runwayweightbearingcapacityswlb);
        obj.put("runwayweightbearingcapacitydwlb", runwayweightbearingcapacitydwlb);
        obj.put("runwayweightbearingcapacitydtlb", runwayweightbearingcapacitydtlb);
        return obj;
    }

    public int getRunwayLength() {
        return runwaylengthlb;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwaylengthlb = runwayLength;
    }

    public int getRunwaywidthlb() {
        return runwaywidthlb;
    }

    public void setRunwaywidthlb(int runwaywidthlb) {
        this.runwaywidthlb = runwaywidthlb;
    }

    public String getRunwayobstaclelb() {
        return runwayobstaclelb;
    }

    public void setRunwayobstaclelb(String runwayobstaclelb) {
        this.runwayobstaclelb = runwayobstaclelb;
    }

    public String getRunwaysurfacetypeconditionlb() {
        return runwaysurfacetypeconditionlb;
    }

    public void setRunwaysurfacetypeconditionlb(String runwaysurfacetypeconditionlb) {
        this.runwaysurfacetypeconditionlb = runwaysurfacetypeconditionlb;
    }

    public String getRunwaysurfacetreatmentlb() {
        return runwaysurfacetreatmentlb;
    }

    public void setRunwaysurfacetreatmentlb(String runwaysurfacetreatmentlb) {
        this.runwaysurfacetreatmentlb = runwaysurfacetreatmentlb;
    }

    public BigDecimal getBaseendphysicalrlevationlb() {
        return baseendphysicalrlevationlb;
    }

    public void setBaseendphysicalrlevationlb(BigDecimal baseendphysicalrlevationlb) {
        this.baseendphysicalrlevationlb = baseendphysicalrlevationlb;
    }

    public String getBaseendalslb() {
        return baseendalslb;
    }

    public void setBaseendalslb(String baseendalslb) {
        this.baseendalslb = baseendalslb;
    }

    public BigDecimal getRunwayweightbearingcapacityswlb() {
        return runwayweightbearingcapacityswlb;
    }

    public void setRunwayweightbearingcapacityswlb(BigDecimal runwayweightbearingcapacityswlb) {
        this.runwayweightbearingcapacityswlb = runwayweightbearingcapacityswlb;
    }

    public BigDecimal getRunwayweightbearingcapacitydwlb() {
        return runwayweightbearingcapacitydwlb;
    }

    public void setRunwayweightbearingcapacitydwlb(BigDecimal runwayweightbearingcapacitydwlb) {
        this.runwayweightbearingcapacitydwlb = runwayweightbearingcapacitydwlb;
    }

    public BigDecimal getRunwayweightbearingcapacitydtlb() {
        return runwayweightbearingcapacitydtlb;
    }

    public void setRunwayweightbearingcapacitydtlb(BigDecimal runwayweightbearingcapacitydtlb) {
        this.runwayweightbearingcapacitydtlb = runwayweightbearingcapacitydtlb;
    }
}
