package com.charterandgo.model;

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
        obj.put("context", context.toJson());
        obj.put("commonParms", commonParms.toJson());
        obj.put("responseMessage", request.toJson());
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
