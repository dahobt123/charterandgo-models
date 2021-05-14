package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.*;

public class AvailabilityItem {

    private String tailNumber;
    private String make;
    private String model;
    private int paxCapacity;
    private BigDecimal cargoCapacity;
    private String currentLoc;

    public AvailabilityItem() {

    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPaxCapacity() {
        return paxCapacity;
    }

    public void setPaxCapacity(int paxCapacity) {
        this.paxCapacity = paxCapacity;
    }

    public String getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        this.currentLoc = currentLoc;
    }

    public BigDecimal getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(BigDecimal cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
