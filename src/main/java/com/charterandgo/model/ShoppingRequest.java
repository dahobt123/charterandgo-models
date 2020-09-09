package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingRequest implements Serializable {

    private String chartersupplierid;
    private int numberofpax;
    private String galley;
    private String head;
    private int headroominches;
    private String flightattendant;
    private String ageofaircraft;
    private String pets;
    private String traveltype;
    private String currency;
    private CommonParms commonParms;
    private InputContext context = new InputContext();
    private Request request = new Request();
    private List<Cargo> cargos = new ArrayList<>();
    private List<Luggage> luggage = new ArrayList<>();


    public ShoppingRequest() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        if (chartersupplierid != null) {
            obj.put("chartersupplierid", chartersupplierid);
        }
        if (galley != null) {
            obj.put("galley", galley);
        }
        if (numberofpax != 0) {
            obj.put("numberofpax", numberofpax);
        }
        if (head != null) {
            obj.put("head", head);
        }
        if (headroominches != 0) {
            obj.put("headroominches", headroominches);
        }
        if (flightattendant != null) {
            obj.put("flightattendant", flightattendant);
        }
        if (ageofaircraft != null) {
            obj.put("ageofaircraft", ageofaircraft);
        }
        if (pets != null) {
            obj.put("pets", pets);
        }
        if (traveltype != null) {
            obj.put("traveltype", traveltype);
        }
        if (currency != null) {
            obj.put("currency", currency);
        }
        obj.put("context", context.toJson());
        obj.put("commonParms", commonParms.toJson());
        obj.put("responseMessage", request.toJson());
        JSONArray cargos1 = new JSONArray();
        for (Cargo carg : cargos) {
            cargos1.put(carg.toJson());
        }
        obj.put("cargo", cargos1);
        JSONArray lugg = new JSONArray();
        for (Luggage lug : luggage) {
            lugg.put(lug.toJson());
        }
        obj.put("luggage", lugg);
        return obj;
    }

    public InputContext getContext() {
        return context;
    }

    public void setContext(InputContext context) {
        this.context = context;
    }

    public Request getDetailrequest() {
        return request;
    }

    public void setDetailrequest(Request request) {
        this.request = request;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(context.toString() + "\n");
        builder.append(request.toString());
        return builder.toString();
    }

    public CommonParms getCommonParms() {
        return commonParms;
    }

    public void setCommonParms(CommonParms commonParms) {
        this.commonParms = commonParms;
    }

    public String getChartersupplierid() {
        return chartersupplierid;
    }

    public void setChartersupplierid(String chartersupplierid) {
        this.chartersupplierid = chartersupplierid;
    }

    public int getNumberofpax() {
        return numberofpax;
    }

    public void setNumberofpax(int numberofpax) {
        this.numberofpax = numberofpax;
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

    public int getHeadroominches() {
        return headroominches;
    }

    public void setHeadroominches(int headroominches) {
        this.headroominches = headroominches;
    }

    public String getFlightattendant() {
        return flightattendant;
    }

    public void setFlightattendant(String flightattendant) {
        this.flightattendant = flightattendant;
    }

    public String getAgeofaircraft() {
        return ageofaircraft;
    }

    public void setAgeofaircraft(String ageofaircraft) {
        this.ageofaircraft = ageofaircraft;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public String getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(String traveltype) {
        this.traveltype = traveltype;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Luggage> getLuggage() {
        return luggage;
    }

    public void setLuggage(List<Luggage> luggage) {
        this.luggage = luggage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
