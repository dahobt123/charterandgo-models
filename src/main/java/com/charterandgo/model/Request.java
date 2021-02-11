package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Request implements Serializable {

    private String flightattendant;
    private BigDecimal totalspend;
    private int numberofpax;
    private List<Journey> journey = new ArrayList<>();
    private List<Offer> options = new ArrayList<>();


    public Request() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
//        JSONArray array = new JSONArray();
//        obj.put("totalspend", totalspend);
//        obj.put("numberofpax", numberofpax);
//        obj.put("flightattendant", flightattendant);
//        obj.put("journey", array);
//        for (Journey jrny : journey) {
//            array.put(jrny.toJson());
//        }
        if (options.size() > 0) {
            JSONArray optArray = new JSONArray();
            obj.put("options", optArray);
            for (Offer option : options) {
                optArray.put(option.toJson());
            }
        }

        return obj;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(totalspend + "/");
        builder.append(flightattendant + "/");
        builder.append(numberofpax + "/");
        for (Journey req : journey) {
            builder.append(req.toString() + "/");
        }
        for (Offer offer : options) {
            builder.append(offer.toString());
        }
        return builder.toString();
    }


    public List<Journey> getJourneyRequest() {
        return journey;
    }

    public void setJourneyRequest(List<Journey> journey) {
        this.journey = journey;
    }

    public List<Offer> getOptions() {
        return options;
    }

    public void setOptions(List<Offer> options) {
        this.options = options;
    }

    public String getFlightattendant() {
        return flightattendant;
    }

    public void setFlightattendant(String flightattendant) {
        this.flightattendant = flightattendant;
    }

    public BigDecimal gettotalspend() {
        return totalspend;
    }

    public void settotalspend(BigDecimal totalspend) {
        this.totalspend = totalspend;
    }

    public int getnumberofpax() {
        return numberofpax;
    }

    public void setnumberofpax(int numberofpax) {
        this.numberofpax = numberofpax;
    }


}
