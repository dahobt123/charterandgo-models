package com.charterandgo.model;

import org.json.JSONObject;

import java.time.ZonedDateTime;
import java.util.Date;

public class OrderItem {

    private int orderItemId;
    private String supplierType;
    private ZonedDateTime departureTimeStamp;
    private String destinationAirportCode;
    private String originAirportName;
    private String destinationAirportName;
    private String originAirportCode;
    private String originCountry;
    private String destinationCountry;
    private String originCity;
    private String destinationCity;
    private String originState;
    private String orderReference;
    private String destinationState;
    private String nnumber;
    private long cagAircraftId;
    private ZonedDateTime arrivalTimeStamp;
    private String segmentStatus;
    private String oldSegmentStatus;
    private int supplierId;
    private int travelTimeMinutes;
    private int ovrTravelTimeMinutes;
    private int originDepartTaxiTime;
    private int ovrOriginDepartTaxiTime;
    private int originArriveTaxiTime;
    private int ovrOriginArriveTaxiTime;
    private int destinationDepartTaxiTime;
    private int ovrDestinationDepartTaxiTime;
    private int destinationArriveTaxiTime;
    private int ovrDestinationArriveTaxiTime;
    private int turnAroundTime;
    private int ovrTurnAroundTime;
    private int segmentType;
    private String originIcaoCode;
    private String destinationIcaoCode;
    private int destinationCityRating;
    private int originCityRating;
    private double mileage;
    private String tripType;
    private int boardLocationId;
    private int arrivalLocationId;
    private long linkedOrder;

    public OrderItem() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("orderItemId", orderItemId);
        obj.put("supplierType", supplierType);
        obj.put("departureTimeStamp", departureTimeStamp);
        obj.put("destinationAirportCode", destinationAirportCode);
        obj.put("originAirportCode", originAirportCode);
        obj.put("originCountry", originCountry);
        obj.put("destinationCountry", destinationCountry);
        obj.put("originCity", originCity);
        obj.put("destinationCity", destinationCity);
        obj.put("originState", originState);
        obj.put("orderReference", orderReference);
        obj.put("destinationState", destinationState);
        obj.put("nnumber", nnumber);
        obj.put("cagAircraftId", cagAircraftId);
        obj.put("arrivalTimeStamp",arrivalTimeStamp);
        obj.put("segmentStatus", segmentStatus);
        obj.put("oldSegmentStatus", oldSegmentStatus);
        obj.put("supplierId", supplierId);
        obj.put("travelTimeMinutes", travelTimeMinutes);
        obj.put("ovrTravelTimeMinutes", ovrTravelTimeMinutes);
        obj.put("originDepartTaxiTime", originDepartTaxiTime);
        obj.put("originArriveTaxiTime", originArriveTaxiTime);
        obj.put("destinationDepartTaxiTime", destinationDepartTaxiTime);
        obj.put("destinationArriveTaxiTime", destinationArriveTaxiTime);
        obj.put("turnAroundTime", turnAroundTime);
        obj.put("ovrTurnAroundTime", ovrTurnAroundTime);
        obj.put("segmentType", segmentType);
        obj.put("originIcaoCode", originIcaoCode);
        obj.put("destinationIcaoCode", destinationIcaoCode);
        obj.put("destinationCityRating", destinationCityRating);
        obj.put("originCityRating", originCityRating);
        obj.put("mileage", mileage);
        obj.put("tripType", tripType);
        obj.put("boardLocationId", boardLocationId);
        obj.put("arrivalLocationId", arrivalLocationId);
        obj.put("linkedOrder", linkedOrder);
        obj.put("originAirportName", originAirportName);
        obj.put("destinationAirportName", destinationAirportName);
        obj.put("ovrOriginDepartTaxiTime", ovrOriginDepartTaxiTime);
        obj.put("ovrDestinationArriveTaxiTime", ovrDestinationArriveTaxiTime);
        obj.put("ovrDestinationDepartTaxiTime", ovrDestinationDepartTaxiTime);
        obj.put("ovrOriginArriveTaxiTime", ovrOriginArriveTaxiTime);
        obj.put("ovrOriginDepartTaxiTime", ovrOriginDepartTaxiTime);
        return obj;
    }


    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public ZonedDateTime getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(ZonedDateTime departureTimeStamp) {
        this.departureTimeStamp = departureTimeStamp;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
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

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

    public long getCagAircraftId() {
        return cagAircraftId;
    }

    public void setCagAircraftId(long cagAircraftId) {
        this.cagAircraftId = cagAircraftId;
    }

    public ZonedDateTime getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(ZonedDateTime arrivalTimeStamp) {
        this.arrivalTimeStamp = arrivalTimeStamp;
    }

    public String getSegmentStatus() {
        return segmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        this.segmentStatus = segmentStatus;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }

    public void setTravelTimeMinutes(int travelTimeMinutes) {
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public int getOriginDepartTaxiTime() {
        return originDepartTaxiTime;
    }

    public void setOriginDepartTaxiTime(int originDepartTaxiTime) {
        this.originDepartTaxiTime = originDepartTaxiTime;
    }

    public int getDestinationDepartTaxiTime() {
        return destinationDepartTaxiTime;
    }

    public void setDestinationDepartTaxiTime(int destinationDepartTaxiTime) {
        this.destinationDepartTaxiTime = destinationDepartTaxiTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(int segmentType) {
        this.segmentType = segmentType;
    }

    public String getOriginIcaoCode() {
        return originIcaoCode;
    }

    public void setOriginIcaoCode(String originIcaoCode) {
        this.originIcaoCode = originIcaoCode;
    }

    public String getDestinationIcaoCode() {
        return destinationIcaoCode;
    }

    public void setDestinationIcaoCode(String destinationIcaoCode) {
        this.destinationIcaoCode = destinationIcaoCode;
    }

    public int getDestinationCityRating() {
        return destinationCityRating;
    }

    public void setDestinationCityRating(int destinationCityRating) {
        this.destinationCityRating = destinationCityRating;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public int getBoardLocationId() {
        return boardLocationId;
    }

    public void setBoardLocationId(int boardLocationId) {
        this.boardLocationId = boardLocationId;
    }

    public int getArrivalLocationId() {
        return arrivalLocationId;
    }

    public void setArrivalLocationId(int arrivalLocationId) {
        this.arrivalLocationId = arrivalLocationId;
    }

    public long getLinkedOrder() {
        return linkedOrder;
    }

    public void setLinkedOrder(long linkedOrder) {
        this.linkedOrder = linkedOrder;
    }

    public int getOriginArriveTaxiTime() {
        return originArriveTaxiTime;
    }

    public void setOriginArriveTaxiTime(int originArriveTaxiTime) {
        this.originArriveTaxiTime = originArriveTaxiTime;
    }

    public int getDestinationArriveTaxiTime() {
        return destinationArriveTaxiTime;
    }

    public void setDestinationArriveTaxiTime(int destinationArriveTaxiTime) {
        this.destinationArriveTaxiTime = destinationArriveTaxiTime;
    }

    public int getOriginCityRating() {
        return originCityRating;
    }

    public void setOriginCityRating(int originCityRating) {
        this.originCityRating = originCityRating;
    }

    public String getOldSegmentStatus() {
        return oldSegmentStatus;
    }

    public void setOldSegmentStatus(String oldSegmentStatus) {
        this.oldSegmentStatus = oldSegmentStatus;
    }

    public String getOriginAirportName() {
        return originAirportName;
    }

    public void setOriginAirportName(String originAirportName) {
        this.originAirportName = originAirportName;
    }

    public String getDestinationAirportName() {
        return destinationAirportName;
    }

    public void setDestinationAirportName(String destinationAirportName) {
        this.destinationAirportName = destinationAirportName;
    }

    public int getOvrOriginDepartTaxiTime() {
        return ovrOriginDepartTaxiTime;
    }

    public void setOvrOriginDepartTaxiTime(int ovrOriginDepartTaxiTime) {
        this.ovrOriginDepartTaxiTime = ovrOriginDepartTaxiTime;
    }

    public int getOvrOriginArriveTaxiTime() {
        return ovrOriginArriveTaxiTime;
    }

    public void setOvrOriginArriveTaxiTime(int ovrOriginArriveTaxiTime) {
        this.ovrOriginArriveTaxiTime = ovrOriginArriveTaxiTime;
    }

    public int getOvrDestinationDepartTaxiTime() {
        return ovrDestinationDepartTaxiTime;
    }

    public void setOvrDestinationDepartTaxiTime(int ovrDestinationDepartTaxiTime) {
        this.ovrDestinationDepartTaxiTime = ovrDestinationDepartTaxiTime;
    }

    public int getOvrDestinationArriveTaxiTime() {
        return ovrDestinationArriveTaxiTime;
    }

    public void setOvrDestinationArriveTaxiTime(int ovrDestinationArriveTaxiTime) {
        this.ovrDestinationArriveTaxiTime = ovrDestinationArriveTaxiTime;
    }

    public int getOvrTurnAroundTime() {
        return ovrTurnAroundTime;
    }

    public void setOvrTurnAroundTime(int ovrTurnAroundTime) {
        this.ovrTurnAroundTime = ovrTurnAroundTime;
    }


    public int getOvrTravelTimeMinutes() {
        return ovrTravelTimeMinutes;
    }

    public void setOvrTravelTimeMinutes(int ovrTravelTimeMinutes) {
        this.ovrTravelTimeMinutes = ovrTravelTimeMinutes;
    }
}
