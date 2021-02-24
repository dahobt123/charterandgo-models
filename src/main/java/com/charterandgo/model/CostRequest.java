package com.charterandgo.model;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CostRequest {

    private InputContext context;
    private CommonParms commonParms;
    private Order request;
    private List<AirportInfo> airports = new ArrayList<>();

    public CostRequest() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("context", context.toJson());

        return obj;
    }

    public InputContext getContext() {
        return context;
    }

    public void setContext(InputContext context) {
        this.context = context;
    }

    public CommonParms getCommonParms() {
        return commonParms;
    }

    public void setCommonParms(CommonParms commonParms) {
        this.commonParms = commonParms;
    }

    public Order getRequest() {
        return request;
    }

    public void setRequest(Order request) {
        this.request = request;
    }

    public List<AirportInfo> getAirports() {
        return airports;
    }

    public void setAirports(List<AirportInfo> airports) {
        this.airports = airports;
    }
}
