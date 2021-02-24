package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Journey implements Serializable {

    private String originAirportCode;
    private String originCity;
    private String originState;
    private String originCountry;
    private String destinationAirportCode;
    private String destinationCity;
    private String destinationState;
    private String destinationCountry;
    private String airportType;
    private String aircraftType;
    private String manufacturer;
    private String model;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;

    public Journey() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("originAirportCode", originAirportCode);
        obj.put("originCity", originCity);
        obj.put("originState", originState);
        obj.put("originCountry", originCountry);
        obj.put("destinationAirportCode", destinationAirportCode);
        obj.put("destinationAirportCode", destinationAirportCode);
        obj.put("destinationState", destinationState);
        obj.put("destinationCountry", destinationCountry);
        obj.put("airportType", airportType);
        obj.put("aircraftType", aircraftType);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("departureDate", departureDate);
        obj.put("departureTime", getDepartureTime());
        obj.put("arrivalTime", getArrivalTime());
        obj.put("arrivalDate", arrivalDate);
        return obj;
    }

    public String toString() {
        return originAirportCode + "-" + originCity + "-" + originState + "-" + originCountry + "-" +
                destinationAirportCode + "-" + destinationCity + "-" + destinationState + "-" + destinationCountry +
                "-" + airportType + "-"+ aircraftType + "-" + manufacturer + "-" + model + "-" + departureDate + "-" + departureTime + "-" +
                arrivalTime + "\n";
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public String getAirportType() {
        return airportType;
    }

    public void setAirportType(String airportType) {
        this.airportType = airportType;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
