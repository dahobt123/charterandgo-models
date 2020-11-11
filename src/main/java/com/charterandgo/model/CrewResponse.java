package com.charterandgo.model;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CrewResponse {

    int charterId;
    List<Crew> crewList = new ArrayList<>();

    public CrewResponse(int charterId, List<Crew> crewList) {
        this.charterId = charterId;
        this.crewList = crewList;
    }

    public int getCharterId() {
        return charterId;
    }

    public void setCharterId(int charterId) {
        this.charterId = charterId;
    }

    public List<Crew> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Crew> crewList) {
        this.crewList = crewList;
    }

    @Override
    public String toString() {
        return "CrewResponse{" +
                "charterId=" + charterId +
                ", crewList=" + crewList +
                '}';
    }

    public JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("charterId", charterId);
        obj.put("crewList", crewList);
        return obj;
    }
}
