package com.charterandgo.model;

import java.math.BigDecimal;

public class AircraftCosts {

    public AircraftCosts() {

    }

    private int id;
    private String charterSupplierId;
    private String tailNumber;
    private String make;
    private String model;
    private String ioacCode;
    private int expectedLife;
    private BigDecimal utilization = new BigDecimal("0.00");
    private BigDecimal softwareMaintenance = new BigDecimal("0.00");
    private BigDecimal hardwareMaintenance = new BigDecimal("0.00");
    private BigDecimal faaMandatesAnnual = new BigDecimal("0.00");
    private BigDecimal totalValueOfAircraft = new BigDecimal("0.00");
    private BigDecimal downPayment = new BigDecimal("0.00");
    private BigDecimal loanPayments = new BigDecimal("0.00");
    private BigDecimal insuranceHull = new BigDecimal("0.00");
    private BigDecimal insuranceLiability = new BigDecimal("0.00");
    private BigDecimal aircraftInteriorImprovements = new BigDecimal("0.00");
    private BigDecimal maintenanceLabor = new BigDecimal("0.00");
    private BigDecimal partsAirframeEngineAvionics = new BigDecimal("0.00");
    private BigDecimal engineOverhaulReserve = new BigDecimal("0.00");
    private BigDecimal apuOverhaulReserve = new BigDecimal("0.00");
    private BigDecimal transmissionOverhaulReserve = new BigDecimal("0.00");
    private BigDecimal faaMandates = new BigDecimal("0.00");

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

    public String getCharterSupplierId() {
        return charterSupplierId;
    }

    public void setCharterSupplierId(String charterSupplierId) {
        this.charterSupplierId = charterSupplierId;
    }

    public int getExpectedLife() {
        return expectedLife;
    }

    public void setExpectedLife(int expectedLife) {
        this.expectedLife = expectedLife;
    }

    public BigDecimal getFaaMandatesAnnual() {
        return faaMandatesAnnual;
    }

    public void setFaaMandatesAnnual(BigDecimal faaMandatesAnnual) {
        this.faaMandatesAnnual = faaMandatesAnnual;
    }

    public BigDecimal getTotalValueOfAircraft() {
        return totalValueOfAircraft;
    }

    public void setTotalValueOfAircraft(BigDecimal totalValueOfAircraft) {
        this.totalValueOfAircraft = totalValueOfAircraft;
    }

    public BigDecimal getAircraftInteriorImprovements() {
        return aircraftInteriorImprovements;
    }

    public void setAircraftInteriorImprovements(BigDecimal aircraftInteriorImprovements) {
        this.aircraftInteriorImprovements = aircraftInteriorImprovements;
    }

    public BigDecimal getApuOverhaulReserve() {
        return apuOverhaulReserve;
    }

    public void setApuOverhaulReserve(BigDecimal apuOverhaulReserve) {
        this.apuOverhaulReserve = apuOverhaulReserve;
    }

    public BigDecimal getTransmissionOverhaulReserve() {
        return transmissionOverhaulReserve;
    }

    public void setTransmissionOverhaulReserve(BigDecimal transmissionOverhaulReserve) {
        this.transmissionOverhaulReserve = transmissionOverhaulReserve;
    }

    public BigDecimal getFaaMandates() {
        return faaMandates;
    }

    public void setFaaMandates(BigDecimal faaMandates) {
        this.faaMandates = faaMandates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
