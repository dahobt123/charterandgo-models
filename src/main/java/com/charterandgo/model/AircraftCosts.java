package com.charterandgo.model;

import java.math.BigDecimal;

public class AircraftCosts {

    public AircraftCosts() {

    }

    private String tailNumber;
    private String make;
    private String model;
    private String ioacCode;
    private BigDecimal utilization = new BigDecimal("0.00");
    private BigDecimal maintenanceLabor = new BigDecimal("0.00");
    private BigDecimal partsAirframeEngineAvionics = new BigDecimal("0.00");
    private BigDecimal engineOverhaulReserve = new BigDecimal("0.00");
    private BigDecimal otherOverhaulReserve = new BigDecimal("0.00");
    private BigDecimal downPayment = new BigDecimal("0.00");
    private BigDecimal loanPayments = new BigDecimal("0.00");
    private BigDecimal insuranceHull = new BigDecimal("0.00");
    private BigDecimal insuranceLiability = new BigDecimal("0.00");
    private BigDecimal hangarFees = new BigDecimal("0.00");
    private BigDecimal parkingFees = new BigDecimal("0.00");
    private BigDecimal navCharts = new BigDecimal("0.00");
    private BigDecimal fltPlanningServices = new BigDecimal("0.00");
    private BigDecimal otherSubscriptions = new BigDecimal("0.00");
    private BigDecimal aircraftCleaning = new BigDecimal("0.00");
    private BigDecimal aircraftImprovements = new BigDecimal("0.00");
    private BigDecimal groundCrew = new BigDecimal("0.00");
    private BigDecimal otherSoftwareServices = new BigDecimal("0.00");
    private BigDecimal softwareMaintenance = new BigDecimal("0.00");
    private BigDecimal hardwareMaintenance = new BigDecimal("0.00");

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

    public String getIoacCode() {
        return ioacCode;
    }

    public void setIoacCode(String ioacCode) {
        this.ioacCode = ioacCode;
    }

    public BigDecimal getUtilization() {
        return utilization;
    }

    public void setUtilization(BigDecimal utilization) {
        this.utilization = utilization;
    }

    public BigDecimal getMaintenanceLabor() {
        return maintenanceLabor;
    }

    public void setMaintenanceLabor(BigDecimal maintenanceLabor) {
        this.maintenanceLabor = maintenanceLabor;
    }

    public BigDecimal getPartsAirframeEngineAvionics() {
        return partsAirframeEngineAvionics;
    }

    public void setPartsAirframeEngineAvionics(BigDecimal partsAirframeEngineAvionics) {
        this.partsAirframeEngineAvionics = partsAirframeEngineAvionics;
    }

    public BigDecimal getEngineOverhaulReserve() {
        return engineOverhaulReserve;
    }

    public void setEngineOverhaulReserve(BigDecimal engineOverhaulReserve) {
        this.engineOverhaulReserve = engineOverhaulReserve;
    }

    public BigDecimal getOtherOverhaulReserve() {
        return otherOverhaulReserve;
    }

    public void setOtherOverhaulReserve(BigDecimal otherOverhaulReserve) {
        this.otherOverhaulReserve = otherOverhaulReserve;
    }

    public BigDecimal getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(BigDecimal downPayment) {
        this.downPayment = downPayment;
    }

    public BigDecimal getLoanPayments() {
        return loanPayments;
    }

    public void setLoanPayments(BigDecimal loanPayments) {
        this.loanPayments = loanPayments;
    }

    public BigDecimal getInsuranceHull() {
        return insuranceHull;
    }

    public void setInsuranceHull(BigDecimal insuranceHull) {
        this.insuranceHull = insuranceHull;
    }

    public BigDecimal getInsuranceLiability() {
        return insuranceLiability;
    }

    public void setInsuranceLiability(BigDecimal insuranceLiability) {
        this.insuranceLiability = insuranceLiability;
    }

    public BigDecimal getHangarFees() {
        return hangarFees;
    }

    public void setHangarFees(BigDecimal hangarFees) {
        this.hangarFees = hangarFees;
    }

    public BigDecimal getParkingFees() {
        return parkingFees;
    }

    public void setParkingFees(BigDecimal parkingFees) {
        this.parkingFees = parkingFees;
    }

   public BigDecimal getNavCharts() {
        return navCharts;
    }

    public void setNavCharts(BigDecimal navCharts) {
        this.navCharts = navCharts;
    }

    public BigDecimal getFltPlanningServices() {
        return fltPlanningServices;
    }

    public void setFltPlanningServices(BigDecimal fltPlanningServices) {
        this.fltPlanningServices = fltPlanningServices;
    }

    public BigDecimal getOtherSubscriptions() {
        return otherSubscriptions;
    }

    public void setOtherSubscriptions(BigDecimal otherSubscriptions) {
        this.otherSubscriptions = otherSubscriptions;
    }

    public BigDecimal getAircraftCleaning() {
        return aircraftCleaning;
    }

    public void setAircraftCleaning(BigDecimal aircraftCleaning) {
        this.aircraftCleaning = aircraftCleaning;
    }

    public BigDecimal getAircraftImprovements() {
        return aircraftImprovements;
    }

    public void setAircraftImprovements(BigDecimal aircraftImprovements) {
        this.aircraftImprovements = aircraftImprovements;
    }

    public BigDecimal getGroundCrew() {
        return groundCrew;
    }

    public void setGroundCrew(BigDecimal groundCrew) {
        this.groundCrew = groundCrew;
    }

    public BigDecimal getOtherSoftwareServices() {
        return otherSoftwareServices;
    }

    public void setOtherSoftwareServices(BigDecimal otherSoftwareServices) {
        this.otherSoftwareServices = otherSoftwareServices;
    }

    public BigDecimal getSoftwareMaintenance() {
        return softwareMaintenance;
    }

    public void setSoftwareMaintenance(BigDecimal softwareMaintenance) {
        this.softwareMaintenance = softwareMaintenance;
    }

    public BigDecimal getHardwareMaintenance() {
        return hardwareMaintenance;
    }

    public void setHardwareMaintenance(BigDecimal hardwareMaintenance) {
        this.hardwareMaintenance = hardwareMaintenance;
    }
}
