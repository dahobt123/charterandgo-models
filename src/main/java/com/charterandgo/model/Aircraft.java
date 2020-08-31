package com.charterandgo.model;


import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aircraft implements Serializable {
    private String nnumber;
    private String ageofaircraft;
    private String manufacturer;
    private String model;
    private String enginetype;
    private int numberofengines;
    private String galley;
    private String head;
    private int numberofpax;
    private List<RichMedia> richmedia = new ArrayList<>();


    public Aircraft() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getNnumber() + "-");
        builder.append(getAgeofaircraft() + "-");
        builder.append(getManufacturer() + "-");
        builder.append(getModel() + "-");
        builder.append(getEnginetype() + "-");
        builder.append(Integer.toString(getNumberofengines()) + "-");
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
        return obj;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

    public String getAgeofaircraft() {
        return ageofaircraft;
    }

    public void setAgeofaircraft(String ageofaircraft) {
        this.ageofaircraft = ageofaircraft;
    }

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

    public int getNumberofengines() {
        return numberofengines;
    }

    public void setNumberofengines(int numberofengines) {
        this.numberofengines = numberofengines;
    }

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
}
