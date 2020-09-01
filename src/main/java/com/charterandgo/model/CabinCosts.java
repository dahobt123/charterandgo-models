package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class CabinCosts {

    public CabinCosts() {
        
    }

    private int id;
    private String charterSupplierId;
    private String aircraftType;
    private BigDecimal cateringAndCleaning = new BigDecimal("0.00");
    private BigDecimal pilotCopilotSalaries = new BigDecimal("0.00");;
    private BigDecimal pilotUtilization = new BigDecimal("0.00");;
    private BigDecimal flightCrewOverhead = new BigDecimal("0.00");;
    private BigDecimal flightAttendant = new BigDecimal("0.00");;
    private BigDecimal aircraftCleaning = new BigDecimal("0.00");;
    private BigDecimal groundCrew = new BigDecimal("0.00");;
    private BigDecimal adminOverhead = new BigDecimal("0.00");;
    private BigDecimal facilities = new BigDecimal("0.00");;

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public BigDecimal getCateringAndCleaning() {
        return cateringAndCleaning;
    }

    public void setCateringAndCleaning(BigDecimal cateringAndCleaning) {
        this.cateringAndCleaning = cateringAndCleaning;
    }

    public BigDecimal getPilotCopilotSalaries() {
        return pilotCopilotSalaries;
    }

    public void setPilotCopilotSalaries(BigDecimal pilotCopilotSalaries) {
        this.pilotCopilotSalaries = pilotCopilotSalaries;
    }

    public BigDecimal getFlightCrewOverhead() {
        return flightCrewOverhead;
    }

    public void setFlightCrewOverhead(BigDecimal flightCrewOverhead) {
        this.flightCrewOverhead = flightCrewOverhead;
    }

    public BigDecimal getFlightAttendant() {
        return flightAttendant;
    }

    public void setFlightAttendant(BigDecimal flightAttendant) {
        this.flightAttendant = flightAttendant;
    }

    public BigDecimal getGroundCrew() {
        return groundCrew;
    }

    public void setGroundCrew(BigDecimal groundCrew) {
        this.groundCrew = groundCrew;
    }

    public BigDecimal getAdminOverhead() {
        return adminOverhead;
    }

    public void setAdminOverhead(BigDecimal adminOverhead) {
        this.adminOverhead = adminOverhead;
    }

    public BigDecimal getFacilities() {
        return facilities;
    }

    public void setFacilities(BigDecimal facilities) {
        this.facilities = facilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharterSupplierId() {
        return charterSupplierId;
    }

    public void setCharterSupplierId(String charterSupplierId) {
        this.charterSupplierId = charterSupplierId;
    }
}
