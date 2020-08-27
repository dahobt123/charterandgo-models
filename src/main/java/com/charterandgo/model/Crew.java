package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Crew implements Serializable {

    private String crewtype;
    private int crewprofileid;

    public Crew() {

    }

    public String toString() {
        return crewtype + "-" + Integer.toString(crewprofileid);
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewtype", crewtype);
        obj.put("crewprofileid", crewprofileid);
        return obj;
    }

    public String getCrewtype() {
        return crewtype;
    }

    public void setCrewtype(String crewtype) {
        this.crewtype = crewtype;
    }

    public int getCrewprofileid() {
        return crewprofileid;
    }

    public void setCrewprofileid(int crewprofileid) {
        this.crewprofileid = crewprofileid;
    }
}
