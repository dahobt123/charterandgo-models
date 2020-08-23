package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Request implements Serializable {

    private List<Journey> journey = new ArrayList<>();
    private List<JourneyOption> options = new ArrayList<>();

    public Request() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        obj.put("journey", array);
        for (Journey jrny : journey) {
            array.put(jrny.toJson());
        }
        if (options.size() > 0) {
            System.out.println("In options toJSon");
            JSONArray optArray = new JSONArray();
            obj.put("options", optArray);
            for (JourneyOption option : options) {
                optArray.put(option.toJson());
            }
        }
        return obj;
    }

    public String toString() {
        System.out.println("In DetailRequest.toString");
        StringBuilder builder = new StringBuilder();
        for (Journey req : journey) {
            builder.append(req.toString() + "\n");
        }
        return builder.toString();
    }


    public List<Journey> getJourneyRequest() {
        return journey;
    }

    public void setJourneyRequest(List<Journey> journey) {
        this.journey = journey;
    }

    public List<JourneyOption> getOptions() {
        return options;
    }

    public void setOptions(List<JourneyOption> options) {
        this.options = options;
    }

}
