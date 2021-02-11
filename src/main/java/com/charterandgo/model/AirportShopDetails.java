package com.charterandgo.model;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AirportShopDetails {
    private String owner;
    private String powerplantrepair;
    private double noncommerciallandingfees;
    private int helicoptersga;
    private String manager;
    private int multienginega;
    private int jetenginega;
    private String use;
    private String bottledoxygentype;
    private String facilityname;
    private double costofcity;
    private int singleenginega;
    private String ownership;
    private String airframerepair;
    private String locationid;
    private String managerphone;
    private String ownerphone;
    private double highdensityfee;
    private List<String> fuelTypes = new ArrayList<>();
    private double latitude;
    private double longitude;

    public AirportShopDetails() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("owner", owner);
        obj.put("powerplantrepair", powerplantrepair);
        obj.put("noncommerciallandingfees", noncommerciallandingfees);
        obj.put("helicoptersga", helicoptersga);
        obj.put("manager", manager);
        obj.put("multienginega", multienginega);
        obj.put("jetenginega", jetenginega);
        obj.put("use", use);
        obj.put("bottledoxygentype", bottledoxygentype);
        obj.put("facilityname", facilityname);
        obj.put("costofcity", costofcity);
        obj.put("singleenginega", singleenginega);
        obj.put("ownership", ownership);
        obj.put("airframerepair",airframerepair );
        obj.put("locationid",locationid );
        obj.put("managerphone",managerphone );
        obj.put("ownerphone", ownerphone);
        obj.put("highdensityfee", highdensityfee);
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

    public String getPowerplantrepair() {
        return powerplantrepair;
    }

    public void setPowerplantrepair(String powerplantrepair) {
        this.powerplantrepair = powerplantrepair;
    }

    public double getNoncommerciallandingfees() {
        return noncommerciallandingfees;
    }

    public void setNoncommerciallandingfees(double noncommerciallandingfees) {
        this.noncommerciallandingfees = noncommerciallandingfees;
    }

    public int getHelicoptersga() {
        return helicoptersga;
    }

    public void setHelicoptersga(int helicoptersga) {
        this.helicoptersga = helicoptersga;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getMultienginega() {
        return multienginega;
    }

    public void setMultienginega(int multienginega) {
        this.multienginega = multienginega;
    }

    public int getJetenginega() {
        return jetenginega;
    }

    public void setJetenginega(int jetenginega) {
        this.jetenginega = jetenginega;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getBottledoxygentype() {
        return bottledoxygentype;
    }

    public void setBottledoxygentype(String bottledoxygentype) {
        this.bottledoxygentype = bottledoxygentype;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public double getCostofcity() {
        return costofcity;
    }

    public void setCostofcity(double costofcity) {
        this.costofcity = costofcity;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getAirframerepair() {
        return airframerepair;
    }

    public void setAirframerepair(String airframerepair) {
        this.airframerepair = airframerepair;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getManagerphone() {
        return managerphone;
    }

    public void setManagerphone(String managerphone) {
        this.managerphone = managerphone;
    }

    public String getOwnerphone() {
        return ownerphone;
    }

    public void setOwnerphone(String ownerphone) {
        this.ownerphone = ownerphone;
    }

    public double getHighdensityfee() {
        return highdensityfee;
    }

    public void setHighdensityfee(double highdensityfee) {
        this.highdensityfee = highdensityfee;
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

    public int getSingleenginega() {
        return singleenginega;
    }

    public void setSingleenginega(int singleenginega) {
        this.singleenginega = singleenginega;
    }
}
