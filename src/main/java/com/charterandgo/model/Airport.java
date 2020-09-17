package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Airport {

    private String siteNumber;
    private String type;
    private String locid;
    private BigDecimal arpLat;
    private String arpLatS;
    private BigDecimal arpLong;
    private String arpLongS;
    private String state;
    private String county;
    private String city;
    private String countryCode;
    private String icaoCode;
    private Date lastUpdated;

    public Airport() {

    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getLocid() {
        return locid;
    }

    public void setLocid(String locid) {
        this.locid = locid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getArpLat() {
        return arpLat;
    }

    public void setArpLat(BigDecimal arpLat) {
        this.arpLat = arpLat;
    }

    public String getArpLatS() {
        return arpLatS;
    }

    public void setArpLatS(String arpLatS) {
        this.arpLatS = arpLatS;
    }

    public BigDecimal getArpLong() {
        return arpLong;
    }

    public void setArpLong(BigDecimal arpLong) {
        this.arpLong = arpLong;
    }

    public String getArpLongS() {
        return arpLongS;
    }

    public void setArpLongS(String arpLongS) {
        this.arpLongS = arpLongS;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }
}
