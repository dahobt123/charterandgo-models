package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingRequest implements Serializable {

    private String supplierId;
    private int numberOfPax;
    private String galley;
    private String head;
    private int headRoomInches;
    private String flightAttendant;
    private String manufacturedAfter;
    private String pets;
    private String travelType;
    private String currency;
    private CommonParms commonParms;
    private InputContext context = new InputContext();
    private Request request = new Request();
    private List<Aircraft> aircraft = new ArrayList<>();
    private List<AirportShopData> airports = new ArrayList<>();
    private List<Cargo> cargos = new ArrayList<>();
    private List<Luggage> luggage = new ArrayList<>();


    public ShoppingRequest() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        if (supplierId != null) {
            obj.put("chartersupplierid", supplierId);
        }
        if (galley != null) {
            obj.put("galley", galley);
        }
        if (numberOfPax != 0) {
            obj.put("numberofpax", numberOfPax);
        }
        if (head != null) {
            obj.put("head", head);
        }
        if (headRoomInches != 0) {
            obj.put("headroominches", headRoomInches);
        }
        if (flightAttendant != null) {
            obj.put("flightattendant", flightAttendant);
        }
        if (manufacturedAfter != null) {
            obj.put("ageofaircraft", manufacturedAfter);
        }
        if (pets != null) {
            obj.put("pets", pets);
        }
        if (travelType != null) {
            obj.put("traveltype", travelType);
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
        if (aircraft.size() > 0) {
            JSONArray aircraftArray = new JSONArray();
            for (Aircraft info : aircraft) {
                aircraftArray.put(info.toJson());
            }
            obj.put("aircraft", aircraftArray);
        }
        if (airports.size() > 0) {
            JSONArray airportArray = new JSONArray();
            for (AirportShopData info : airports) {
                airportArray.put(info.toJson());
            }
            obj.put("airports", airportArray);
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

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public int getNumberOfPax() {
        return numberOfPax;
    }

    public void setNumberOfPax(int numberOfPax) {
        this.numberOfPax = numberOfPax;
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

    public int getHeadRoomInches() {
        return headRoomInches;
    }

    public void setHeadRoomInches(int headRoomInches) {
        this.headRoomInches = headRoomInches;
    }

    public String getFlightAttendant() {
        return flightAttendant;
    }

    public void setFlightAttendant(String flightAttendant) {
        this.flightAttendant = flightAttendant;
    }

    public String getManufacturedAfter() {
        return manufacturedAfter;
    }

    public void setManufacturedAfter(String manufacturedAfter) {
        this.manufacturedAfter = manufacturedAfter;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
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

    public List<AirportShopData> getAirportInfo() {
        return airports;
    }

    public void setAirportInfo(List<AirportShopData> airportInfo) {
        this.airports = airportInfo;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }
}
