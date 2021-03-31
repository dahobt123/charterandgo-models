package com.charterandgo.model;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AirportFacilitiesInfo {

    private String siteNumber;
    private String locId;
    private String facilityName;
    private String customsPointOfEntry;
    private String ownerShip;
    private String use;
    private String owner;
    private String ownerAddress;
    private String ownerCSZ;
    private String ownerPhone;
    private String manager;
    private String managerAddress;
    private String managerCSZ;
    private String managerPhone;
    private List<String> fuelTypes = new ArrayList<>();
    private String airFrameRepair;
    private String powerPlantRepair;
    private String bottledOxygenType;
    private String bulkOxygenType;
    private int singleEngineGA;
    private int multiEngineGA;
    private int jetEngineGA;
    private int helicoptersGA;
    private String icaoIdentifier;
    private double latitude;
    private double longitude;

    public AirportFacilitiesInfo() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("siteNumber", siteNumber);
        obj.put("locId", locId);
        obj.put("facilityName", facilityName);
        obj.put("customsPointOfEntry", customsPointOfEntry);
        obj.put("ownerShip", ownerShip);
        obj.put("use", use);
        obj.put("owner", owner);
        obj.put("ownerAddress", ownerAddress);
        obj.put("ownerCSZ", ownerCSZ);
        obj.put("ownerPhone", ownerPhone);
        obj.put("manager",manager);
        obj.put("managerAddress", managerAddress);
        obj.put("managerCSZ", managerCSZ);
        obj.put("managerPhone", managerPhone);
        obj.put("fuelTypes", fuelTypes);
        obj.put("airFrameRepair", airFrameRepair);
        obj.put("powerPlantRepair", powerPlantRepair);
        obj.put("bottledOxygenType", bottledOxygenType);
        obj.put("bulkOxygenType", bulkOxygenType);
        obj.put("singleEngineGA", singleEngineGA);
        obj.put("multiEngineGA", multiEngineGA);
        obj.put("jetEngineGA", jetEngineGA);
        obj.put("helicoptersGA", helicoptersGA);
        obj.put("icaoIdentifier", icaoIdentifier);
        obj.put("latitude",latitude);
        obj.put("longitude", longitude);
        return obj;
    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String isCustomsPointOfEntry() {
        return customsPointOfEntry;
    }

    public void setCustomsPointOfEntry(String customsPointOfEntry) {
        this.customsPointOfEntry = customsPointOfEntry;
    }

    public String getOwnerShip() {
        return ownerShip;
    }

    public void setOwnerShip(String ownerShip) {
        this.ownerShip = ownerShip;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerCSZ() {
        return ownerCSZ;
    }

    public void setOwnerCSZ(String ownerCSZ) {
        this.ownerCSZ = ownerCSZ;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagerAddress() {
        return managerAddress;
    }

    public void setManagerAddress(String managerAddress) {
        this.managerAddress = managerAddress;
    }

    public String getManagerCSZ() {
        return managerCSZ;
    }

    public void setManagerCSZ(String managerCSZ) {
        this.managerCSZ = managerCSZ;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public List<String> getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(List<String> fuelTypes) {
        this.fuelTypes = fuelTypes;
    }

    public String isAirFrameRepair() {
        return airFrameRepair;
    }

    public void setAirFrameRepair(String airFrameRepair) {
        this.airFrameRepair = airFrameRepair;
    }

    public String isPowerPlantRepair() {
        return powerPlantRepair;
    }

    public void setPowerPlantRepair(String powerPlantRepair) {
        this.powerPlantRepair = powerPlantRepair;
    }

    public String isBottledOxygenType() {
        return bottledOxygenType;
    }

    public void setBottledOxygenType(String bottledOxygenType) {
        this.bottledOxygenType = bottledOxygenType;
    }

    public String isBulkOxygenType() {
        return bulkOxygenType;
    }

    public void setBulkOxygenType(String bulkOxygenType) {
        this.bulkOxygenType = bulkOxygenType;
    }

    public int getSingleEngineGA() {
        return singleEngineGA;
    }

    public void setSingleEngineGA(int singeEngineGA) {
        this.singleEngineGA = singeEngineGA;
    }

    public int getMultiEngineGA() {
        return multiEngineGA;
    }

    public void setMultiEngineGA(int multiEngineGA) {
        this.multiEngineGA = multiEngineGA;
    }

    public int getJetEngineGA() {
        return jetEngineGA;
    }

    public void setJetEngineGA(int jetEngineGA) {
        this.jetEngineGA = jetEngineGA;
    }

    public void addFuelType(String type) {
        fuelTypes.add(type);
    }

    public int getHelicoptersGA() {
        return helicoptersGA;
    }

    public void setHelicoptersGA(int helicoptersGA) {
        this.helicoptersGA = helicoptersGA;
    }

    public String getIcaoIdentifier() {
        return icaoIdentifier;
    }

    public void setIcaoIdentifier(String icaoIdentifier) {
        this.icaoIdentifier = icaoIdentifier;
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
}
