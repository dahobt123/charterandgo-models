package com.charterandgo.model;


import java.math.BigDecimal;
import java.util.Date;

public class PaxRequest {

    private String start;
    private String end;
    private String departCity;
    private String departState;
    private String departIcaoCode;
    private String departCountry;
    private int departCityRating;
    private String arriveCity;
    private String arriveState;
    private String arriveCountry;
    private int arriveCityRating;
    private String type;
    private Date departureTimestamp;
    private Date arrivalTimestamp;
    private String status;
    private String priorStatus;
    private String suppliertype;
    private String tripType;
    private BigDecimal mileage;
    private int duration;
    private int totalTime;
    private int originDepartTaxiTime;
    private int originArriveTaxiTime;
    private int destinationDepartTaxiTime;
    private int destinationArriveTaxiTime;
    private int turnAroundTime;
    private int operationTypeFAA;
    private String tailNumber;
    private String make;
    private String model;
    private int charterId;
    private long cagaircraftid;
    private RunwayInfo runwayInfo;
    private AirportInfo airportInfo;
    private Aircraft aircraft;
    private AirportFacilitiesInfo airportFacilitiesInfo;
    private String errorCode;
    private int charterSegmentType;

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

    public String getDepartIcaoCode() {
        return departIcaoCode;
    }

    public void setDepartIcaoCode(String departIcaoCode) {
        this.departIcaoCode = departIcaoCode;
    }

    public int getArriveCityRating() {
        return arriveCityRating;
    }

    public void setArriveCityRating(int arriveCityRating) {
        this.arriveCityRating = arriveCityRating;
    }

    public String getDepartCountry() {
        return departCountry;
    }

    public void setDepartCountry(String departCountry) {
        this.departCountry = departCountry;
    }

    public String getArriveCountry() {
        return arriveCountry;
    }

    public void setArriveCountry(String arriveCountry) {
        this.arriveCountry = arriveCountry;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public long getCagaircraftid() {
        return cagaircraftid;
    }

    public void setCagaircraftid(long cagaircraftid) {
        this.cagaircraftid = cagaircraftid;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getOperationTypeFAA() {
        return operationTypeFAA;
    }

    public void setOperationTypeFAA(int operationTypeFAA) {
        this.operationTypeFAA = operationTypeFAA;
    }

    public String getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(String suppliertype) {
        this.suppliertype = suppliertype;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getPriorStatus() {
        return priorStatus;
    }

    public void setPriorStatus(String priorStatus) {
        this.priorStatus = priorStatus;
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

    public int getDepartCityRating() {
        return departCityRating;
    }

    public void setDepartCityRating(int departCityRating) {
        this.departCityRating = departCityRating;
    }

    public int getCharterSegmentType() {
        return charterSegmentType;
    }

    public void setCharterSegmentType(int charterSegmentType) {
        this.charterSegmentType = charterSegmentType;
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
