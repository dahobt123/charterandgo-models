package com.charterandgo.model;

import org.json.JSONObject;

import java.time.LocalDateTime;

public class CrewSegments {
    private int crewProfileId;
    private LocalDateTime DATE;
    private LocalDateTime estimatedStartTime;
    private LocalDateTime estimatedEndTime;
    private double estimatedDuration;
    private LocalDateTime actualStartTime;
    private LocalDateTime actualEndTime;
    private double actualDuration;
    private String destination;
    private String departure;
    private String segmentType;  // plane status (empty leg, repostition)
    private String tailNumber;
    private int orderID;
    private String crewRole;  // pilot, co pilot, plane prep?...
    private int charterSupplierId;
    private String manufacturer;
    private String model;

    public CrewSegments(int crewProfileId, LocalDateTime actualStartTime, LocalDateTime actualEndTime, String destination, String departure, String segmentType, String tailNumber, int orderID, String crewRole, int charterSupplierId, double actualDuration) {
        this.crewProfileId = crewProfileId;
        this.actualStartTime = actualStartTime;
        this.actualEndTime = actualEndTime;
        this.destination = destination;
        this.departure = departure;
        this.segmentType = segmentType;
        this.tailNumber = tailNumber;
        this.orderID = orderID;
        this.crewRole = crewRole;
        this.charterSupplierId = charterSupplierId;
        this.actualDuration = actualDuration;
    }

    public CrewSegments(int crewProfileId){}

    public CrewSegments() {

    }

    public int getCrewProfileId() {
        return crewProfileId;
    }

    public void setCrewProfileId(int crewProfileId) {
        this.crewProfileId = crewProfileId;
    }

    public LocalDateTime getDATE() {
        return DATE;
    }

    public void setDATE(LocalDateTime DATE) {
        this.DATE = DATE;
    }

    public LocalDateTime getEstimatedStartTime() {
        return estimatedStartTime;
    }

    public void setEstimatedStartTime(LocalDateTime estimatedStartTime) {
        this.estimatedStartTime = estimatedStartTime;
    }

    public LocalDateTime getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(LocalDateTime estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }

    public double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public LocalDateTime getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(LocalDateTime actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public LocalDateTime getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(LocalDateTime actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCrewRole() {
        return crewRole;
    }

    public void setCrewRole(String crewRole) {
        this.crewRole = crewRole;
    }

    public int getCharterSupplierId() {
        return charterSupplierId;
    }

    public void setCharterSupplierId(int charterSupplierId) {
        this.charterSupplierId = charterSupplierId;
    }

    public double getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(double actualDuration) {
        this.actualDuration = actualDuration;
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

    public JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("crewProfileId", crewProfileId);
        obj.put("orderID", orderID);
        obj.put("nnumber", tailNumber);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("departure", departure);
        obj.put("destination", destination);
        obj.put("crewRole", crewRole);
        obj.put("segmentType", segmentType);
        obj.put("startTime", actualStartTime);
        obj.put("endTime", actualEndTime);

        return obj;
    }

    @Override
    public String toString() {
        return "CrewSegments{" +
                "crewProfileId=" + crewProfileId +
                ", DATE=" + DATE +
                ", estimatedStartTime=" + estimatedStartTime +
                ", estimatedEndTime=" + estimatedEndTime +
                ", estimatedDuration=" + estimatedDuration +
                ", actualStartTime=" + actualStartTime +
                ", actualEndTime=" + actualEndTime +
                ", actualDuration=" + actualDuration +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", segmentType='" + segmentType + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", orderID=" + orderID +
                ", crewRole='" + crewRole + '\'' +
                ", charterSupplierId=" + charterSupplierId +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CrewSegments crewSegments = (CrewSegments) obj;
        System.out.println(crewSegments);
        return crewProfileId == crewSegments.crewProfileId
                && actualStartTime.equals(crewSegments.actualStartTime)
                && actualEndTime.equals(crewSegments.actualEndTime)
                && destination.equals(crewSegments.destination)
                && departure.equals(crewSegments.departure)
                && segmentType.equals(crewSegments.segmentType)
                && tailNumber.equals(crewSegments.tailNumber)
                && orderID == crewSegments.orderID
                && crewRole.equals(crewSegments.crewRole)
                && charterSupplierId == (crewSegments.charterSupplierId)
                && actualDuration == (crewSegments.actualDuration);
    }
}