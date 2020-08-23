package com.charterandgo.model;


import org.json.JSONObject;

import java.io.Serializable;

public class CommonParms implements Serializable {

    private String action;
    private String view;
    private String version;
    private String client;


    public CommonParms() {

    }

    public String toString() {
        return action + "-" + view + "-" + version + "-" + client;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("action",action);
        obj.put("view",view);
        obj.put("version",version);
        obj.put("client",client);
        return obj;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


}
