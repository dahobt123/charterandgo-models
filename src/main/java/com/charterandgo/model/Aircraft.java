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
        builder.append(nnumber + "-");
        builder.append(ageofaircraft + "-");
        builder.append(manufacturer + "-");
        builder.append(model + "-");
        builder.append(enginetype + "-");
        builder.append(Integer.toString(numberofengines) + "-");
        builder.append(galley + "-");
        builder.append(head + "-");
        builder.append(Integer.toString(numberofpax) + "-");
        for (RichMedia media : richmedia) {
            builder.append(media.toString() + "-");
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        return obj;
    }
}
