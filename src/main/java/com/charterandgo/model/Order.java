package com.charterandgo.model;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private InputContext context;
    private CommonParms commonParms;
    private CostOrder request;
    private List<AirportInfo> airports = new ArrayList<>();

    private Order() {

    }

    public CommonParms getCommonParms() {
        return commonParms;
    }

    public void setCommonParms(CommonParms commonParms) {
        this.commonParms = commonParms;
    }

    public InputContext getContext() {
        return context;
    }

    public void setContext(InputContext context) {
        this.context = context;
    }

    public CostOrder getRequest() {
        return request;
    }

    public void setRequest(CostOrder request) {
        this.request = request;
    }

    public List<AirportInfo> getAirports() {
        return airports;
    }

    public void setAirports(List<AirportInfo> airports) {
        this.airports = airports;
    }
}
