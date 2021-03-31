package com.charterandgo.model;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aircraft implements Serializable {
    private String nnumber;
    private String galley;
    private String head;
    private int headroominches;        //Added for costing and PDAS
    private String enginetype;
    private String manufacturer;
    private String model;
    private int numberofpax;
    private String aircraftType;
    private int shortfuelgallonshour;
    private int mediumfuelgallonshour;
    private int longfuelgallonshour;
    private int manufacturerfuelgallonshour;
    private double mtow;
    private double wingSpan;
    private String icaoCode;
//    private String ageofaircraft;
//    private int numberofengines;
    private List<RichMedia> richmedia = new ArrayList<>();


    public Aircraft() {

    }
@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getNnumber() + "-");
        builder.append(getManufacturer() + "-");
        builder.append(getModel() + "-");
        builder.append(getEnginetype() + "-");
        builder.append(getGalley() + "-");
        builder.append(getHead() + "-");
        builder.append(Integer.toString(getNumberofpax()) + "-");
        for (RichMedia media : getRichmedia()) {
            builder.append(media.toString() + "-");
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("nnumber", nnumber);
//        obj.put("ageofaircraft", ageofaircraft);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("enginetype", enginetype);
//        obj.put("numberofengines", numberofengines);
        obj.put("galley", galley);
        obj.put("head", head);
        obj.put("headroom", headroominches);
        obj.put("numberofpax", numberofpax);
        JSONArray media = new JSONArray();
        for (RichMedia item : richmedia) {
            media.put(item.toJson());
        }
        obj.put("richmedia", media);
        return obj;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

//    public String getAgeofaircraft() {
//        return ageofaircraft;
//    }

//    public void setAgeofaircraft(String ageofaircraft) {
//        this.ageofaircraft = ageofaircraft;
//    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

//    public int getNumberofengines() {
//        return numberofengines;
//    }

//    public void setNumberofengines(int numberofengines) {
//        this.numberofengines = numberofengines;
//    }

    public String getGalley() {
        return galley;
    }

    public void setGalley(String galley) {
        this.galley = galley;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getNumberofpax() {
        return numberofpax;
    }

    public void setNumberofpax(int numberofpax) {
        this.numberofpax = numberofpax;
    }

    public List<RichMedia> getRichmedia() {
        return richmedia;
    }

    public void setRichmedia(List<RichMedia> richmedia) {
        this.richmedia = richmedia;
    }


    public int getHeadroominches() {
        return headroominches;
    }

    public void setHeadroominches(int headroominches) {
        this.headroominches = headroominches;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getShortfuelgallonshour() {
        return shortfuelgallonshour;
    }

    public void setShortfuelgallonshour(int shortfuelgallonshour) {
        this.shortfuelgallonshour = shortfuelgallonshour;
    }

    public int getMediumfuelgallonshour() {
        return mediumfuelgallonshour;
    }

    public void setMediumfuelgallonshour(int mediumfuelgallonshour) {
        this.mediumfuelgallonshour = mediumfuelgallonshour;
    }

    public int getLongfuelgallonshour() {
        return longfuelgallonshour;
    }

    public void setLongfuelgallonshour(int longfuelgallonshour) {
        this.longfuelgallonshour = longfuelgallonshour;
    }

    public int getManufacturerfuelgallonshour() {
        return manufacturerfuelgallonshour;
    }

    public void setManufacturerfuelgallonshour(int manufacturerfuelgallonshour) {
        this.manufacturerfuelgallonshour = manufacturerfuelgallonshour;
    }

    public double getMtow() {
        return mtow;
    }

    public void setMtow(double mtow) {
        this.mtow = mtow;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }
}
