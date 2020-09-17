package com.charterandgo.inventory.model;

import java.math.BigDecimal;
import java.util.Date;

public class AircraftStatus {

    private int key;
    private String airport;
    private String tailNumber;
    private String status;
    private Date departure;
    private Date arrival;
    private String actionCode;
    private int segmentCount;
    private String orderId;
    private boolean isRideShare;
    private String airportStatus;
    private String charterId;

    public AircraftStatus() {

    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public int getSegmentCount() {
        return segmentCount;
    }

    public void setSegmentCount(int segmentCount) {
        this.segmentCount = segmentCount;
    }

    public void incrementSegmentCount() {
        this.segmentCount++;
    }

    public void decrementSegmentCount() {
        this.segmentCount--;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isRideShare() {
        return isRideShare;
    }

    public void setRideShare(boolean rideShare) {
        isRideShare = rideShare;
    }

    public String getAirportStatus() {
        return airportStatus;
    }

    public void setAirportStatus(String airportStatus) {
        this.airportStatus = airportStatus;
    }

    public String getCharterId() {
        return charterId;
    }

    public void setCharterId(String charterId) {
        this.charterId = charterId;
    }
}
