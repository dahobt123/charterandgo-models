package com.charterandgo.model;

import org.json.JSONObject;

import java.util.Date;

public class OrderItem {

    private int orderItemId;
    private String supplierType;
    private Date departureTimeStamp;
    private String destinationAirportCode;
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
    private Date arrivalTimeStamp;
    private String segmentStatus;
    private int supplierId;
    private int travelTimeMinutes;
    private int originTaxiTime;
    private int destinationTaxiTime;
    private int turnAroundTime;
    private int segmentType;
    private String originIcaoCode;
    private String destinationIcaoCode;
    private int destinationCityRating;
    private int mileage;
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
        obj.put("supplierId", supplierId);
        obj.put("travelTimeMinutes", travelTimeMinutes);
        obj.put("originTaxiTime", originTaxiTime);
        obj.put("destinationTaxiTime", destinationTaxiTime);
        obj.put("turnAroundTime", turnAroundTime);
        obj.put("segmentType", segmentType);
        obj.put("originIcaoCode", originIcaoCode);
        obj.put("destinationIcaoCode", destinationIcaoCode);
        obj.put("destinationCityRating", destinationCityRating);
        obj.put("mileage", mileage);
        obj.put("tripType", tripType);
        obj.put("boardLocationId", boardLocationId);
        obj.put("arrivalLocationId", arrivalLocationId);
        obj.put("linkedOrder", linkedOrder);
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

    public Date getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(Date departureTimeStamp) {
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

    public Date getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(Date arrivalTimeStamp) {
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

    public int getOriginTaxiTime() {
        return originTaxiTime;
    }

    public void setOriginTaxiTime(int originTaxiTime) {
        this.originTaxiTime = originTaxiTime;
    }

    public int getDestinationTaxiTime() {
        return destinationTaxiTime;
    }

    public void setDestinationTaxiTime(int destinationTaxiTime) {
        this.destinationTaxiTime = destinationTaxiTime;
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
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
}
