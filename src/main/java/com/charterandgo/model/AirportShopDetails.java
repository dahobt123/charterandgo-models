package com.charterandgo.model;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AirportShopDetails {
    private String owner;
    private String powerPlantRepair;
    private double nonCommercialLandingFees;
    private int helicopterSga;
    private String manager;
    private int multiEngineGa;
    private int jetEngineGa;
    private String use;
    private String bottledOxygenType;
    private String facilityName;
    private double costOfCity;
    private int singleEngineGa;
    private String ownership;
    private String airframeRepair;
    private String locationId;
    private String managerPhone;
    private String ownerPhone;
    private double highDensityFee;
    private List<String> fuelTypes = new ArrayList<>();
    private double latitude;
    private double longitude;

    public AirportShopDetails() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("owner", owner);
        obj.put("powerPlantRepair", powerPlantRepair);
        obj.put("nonCommercialLandingFees", nonCommercialLandingFees);
        obj.put("helicopterSga", helicopterSga);
        obj.put("manager", manager);
        obj.put("multiEngineGa", multiEngineGa);
        obj.put("jetEngineGa", jetEngineGa);
        obj.put("use", use);
        obj.put("bottledOxygenType", bottledOxygenType);
        obj.put("facilityName", facilityName);
        obj.put("costOfCity", costOfCity);
        obj.put("singleEngineGa", singleEngineGa);
        obj.put("ownership", ownership);
        obj.put("airframeRepair", airframeRepair);
        obj.put("locationId", locationId);
        obj.put("managerPhone", managerPhone);
        obj.put("ownerPhone", ownerPhone);
        obj.put("highDensityFee", highDensityFee);
        obj.put("fuelTypes", fuelTypes);
        obj.put("latitude",latitude);
        obj.put("longitude", longitude);
        return obj;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPowerPlantRepair() {
        return powerPlantRepair;
    }

    public void setPowerPlantRepair(String powerPlantRepair) {
        this.powerPlantRepair = powerPlantRepair;
    }

    public double getNonCommercialLandingFees() {
        return nonCommercialLandingFees;
    }

    public void setNonCommercialLandingFees(double nonCommercialLandingFees) {
        this.nonCommercialLandingFees = nonCommercialLandingFees;
    }

    public int getHelicopterSga() {
        return helicopterSga;
    }

    public void setHelicopterSga(int helicopterSga) {
        this.helicopterSga = helicopterSga;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getMultiEngineGa() {
        return multiEngineGa;
    }

    public void setMultiEngineGa(int multiEngineGa) {
        this.multiEngineGa = multiEngineGa;
    }

    public int getJetEngineGa() {
        return jetEngineGa;
    }

    public void setJetEngineGa(int jetEngineGa) {
        this.jetEngineGa = jetEngineGa;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getBottledOxygenType() {
        return bottledOxygenType;
    }

    public void setBottledOxygenType(String bottledOxygenType) {
        this.bottledOxygenType = bottledOxygenType;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public double getCostOfCity() {
        return costOfCity;
    }

    public void setCostOfCity(double costOfCity) {
        this.costOfCity = costOfCity;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getAirframeRepair() {
        return airframeRepair;
    }

    public void setAirframeRepair(String airframeRepair) {
        this.airframeRepair = airframeRepair;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public double getHighDensityFee() {
        return highDensityFee;
    }

    public void setHighDensityFee(double highDensityFee) {
        this.highDensityFee = highDensityFee;
    }

    public List<String> getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(List<String> fuelTypes) {
        this.fuelTypes = fuelTypes;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getSingleEngineGa() {
        return singleEngineGa;
    }

    public void setSingleEngineGa(int singleEngineGa) {
        this.singleEngineGa = singleEngineGa;
    }
}
