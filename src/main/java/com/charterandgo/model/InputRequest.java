package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class InputRequest implements Serializable {

    private CommonParms commonParms;
    private InputContext context = new InputContext();
    private Request request = new Request();


    public InputRequest() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("context", context.toJson());
        obj.put("commonParms", commonParms.toJson());
        obj.put("request", request.toJson());
        return obj;
    }

    public InputContext getContext() {
        return context;
    }

    public void setContext(InputContext context) {
        this.context = context;
    }

    public Request getDetailRequest() {
        return request;
    }

    public void setDetailRequest(Request request) {
        this.request = request;
    }

    public String toString() {
        System.out.println("In InputRequest.toString");
        StringBuilder builder = new StringBuilder();
        builder.append(context.toString() + "\n");
        builder.append(request.toString());
        return builder.toString();
    }

    public CommonParms getCommonParams() {
        return commonParms;
    }

    public void setCommonParams(CommonParms commonParms) {
        this.commonParms = commonParms;
    }
}
