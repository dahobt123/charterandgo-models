package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirportResults {

    private List<AirportInfo> airportsOut = new ArrayList<>();
    private List<AirportInfo> airportsBack = new ArrayList<>();
    private Map<String, BigDecimal> mileages = new HashMap<>();

    public AirportResults() {

    }

    public List<AirportInfo> getAirportsOut() {
        return airportsOut;
    }

    public void setAirportsOut(List<AirportInfo> airportsOut) {
        this.airportsOut = airportsOut;
    }

    public Map<String, BigDecimal> getMileages() {
        return mileages;
    }

    public void setMileages(Map<String, BigDecimal> mileages) {
        this.mileages = mileages;
    }

    public List<AirportInfo> getAirportsBack() {
        return airportsBack;
    }

    public void setAirportsBack(List<AirportInfo> airportsBack) {
        this.airportsBack = airportsBack;
    }
}
