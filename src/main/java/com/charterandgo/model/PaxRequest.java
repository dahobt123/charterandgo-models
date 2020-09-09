package com.charterandgo.model;


import java.math.BigDecimal;
import java.util.Date;

public class PaxRequest {

    private String start;
    private String end;
    private String departCity;
    private String departState;
    private String arriveCity;
    private String arriveState;
    private String type;
    private Date departureTimestamp;
    private Date arrivalTimestamp;
    private String status;
    private BigDecimal mileage;
    private int duration;
    private String tailNumber;
    private String make;
    private String model;
    private int charterId;
    private RunwayInfo runwayInfo;
    private AirportInfo airportInfo;
    private AirportFacilitiesInfo airportFacilitiesInfo;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDepartCity() {
        return departCity;
    }

    public void setDepartCity(String departCity) {
        this.departCity = departCity;
    }

    public String getDepartState() {
        return departState;
    }

    public void setDepartState(String departState) {
        this.departState = departState;
    }

    public String getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity;
    }

    public String getArriveState() {
        return arriveState;
    }

    public void setArriveState(String arriveState) {
        this.arriveState = arriveState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDepartureTimestamp() {
        return departureTimestamp;
    }

    public void setDepartureTimestamp(Date departureTimestamp) {
        this.departureTimestamp = departureTimestamp;
    }

    public Date getArrivalTimestamp() {
        return arrivalTimestamp;
    }

    public void setArrivalTimestamp(Date arrivalTimestamp) {
        this.arrivalTimestamp = arrivalTimestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCharterId() {
        return charterId;
    }

    public void setCharterId(int charterId) {
        this.charterId = charterId;
    }

    public RunwayInfo getRunwayInfo() {
        return runwayInfo;
    }

    public void setRunwayInfo(RunwayInfo runwayInfo) {
        this.runwayInfo = runwayInfo;
    }

    public AirportInfo getAirportInfo() {
        return airportInfo;
    }

    public void setAirportInfo(AirportInfo airportInfo) {
        this.airportInfo = airportInfo;
    }

    public AirportFacilitiesInfo getAirportFacilitiesInfo() {
        return airportFacilitiesInfo;
    }

    public void setAirportFacilitiesInfo(AirportFacilitiesInfo airportFacilitiesInfo) {
        this.airportFacilitiesInfo = airportFacilitiesInfo;
    }

//    public RunwayInfo getRunwayInfo() {
//        return runwayInfo;
//    }
//
//    public void setRunwayInfo(RunwayInfo runwayInfo) {
//        this.runwayInfo = runwayInfo;
//    }
//
//    public AirportInfo getAirportInfo() {
//        return airportInfo;
//    }
//
//    public void setAirportInfo(AirportInfo airportInfo) {
//        this.airportInfo = airportInfo;
//    }
//
//    public AirportFacilitiesInfo getAirportFacilitiesInfo() {
//        return airportFacilitiesInfo;
//    }
//
//    public void setAirportFacilitiesInfo(AirportFacilitiesInfo airportFacilitiesInfo) {
//        this.airportFacilitiesInfo = airportFacilitiesInfo;
//    }
}
