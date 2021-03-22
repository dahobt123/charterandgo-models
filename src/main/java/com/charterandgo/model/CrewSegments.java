package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class CrewSegments implements Serializable {
    private int crewProfileId;
    private LocalDateTime lastUpdated;
    private LocalDateTime estimatedStartTime;
    private LocalDateTime estimatedEndTime;
    private int estimatedDuration;
    private LocalDateTime actualStartTime;
    private LocalDateTime actualEndTime;
    private int actualDuration;
    private String destination;
    private String departure;
    private String segmentType;  // plane status (empty leg, repostition)
    private String tailNumber;
    private int orderID;
    private String crewRole;  // pilot, co pilot, plane prep?...
    private int charterSupplierId;
    private String manufacturer;
    private String model;
    private boolean overRideFlag;
    private int flightPartType;
    private boolean international;
    private int lastUpdatedBy;
    private int UID;
    private int orderItemId;
    private ZoneId zoneId;
    private String timeZone;

    public CrewSegments(int crewProfileId, LocalDateTime actualStartTime, LocalDateTime actualEndTime, String destination, String departure, String segmentType, String tailNumber, int orderID, String crewRole, int charterSupplierId, int actualDuration) {
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

    public CrewSegments(int crewProfileId) {
    }

    public CrewSegments() {

    }

    public int getCrewProfileId() {
        return crewProfileId;
    }

    public void setCrewProfileId(int crewProfileId) {
        this.crewProfileId = crewProfileId;
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

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
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

    public int getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(int actualDuration) {
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

    public boolean isOverRideFlag() {
        return overRideFlag;
    }

    public void setOverRideFlag(boolean overRideFlag) {
        this.overRideFlag = overRideFlag;
    }

    public int getFlightPartType() {
        return flightPartType;
    }

    public void setFlightPartType(int flightPartType) {
        this.flightPartType = flightPartType;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewProfileId", crewProfileId);
        obj.put("orderID", orderID);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
        obj.put("tailNumber", tailNumber);
        obj.put("departure", departure);
        obj.put("destination", destination);
        obj.put("crewRole", crewRole);
        obj.put("segmentType", segmentType);
        obj.put("startTime", actualStartTime);
        obj.put("endTime", actualEndTime);
        obj.put("UID", UID);
        obj.put("offerItemId", orderItemId);
        obj.put("international", international);
        obj.put("flightPartType", flightPartType);
        obj.put("orderItemId", orderItemId);
        obj.put("zoneId", zoneId);

        return obj;
    }

    @Override
    public String toString() {
        return "CrewSegments{" +
                "crewProfileId=" + crewProfileId +
                ", lastUpdated=" + lastUpdated +
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

    /**
     * return the min number of pilots needed for a duty duration
     *
     * @param minNumOfPilots
     * @param flightDuration
     * @return min number of pilots
     */
    public static int minNumberOfPilotsForDuty(int minNumOfPilots, int flightDuration, LocalDateTime start) {

        if (start != null && start.getHour() < 8 && start.getHour() >= 5 && flightDuration <= 15 * 60)
            return Math.max(minNumOfPilots, 1);
        else if (flightDuration <= 15 * 60)
            return Math.max(minNumOfPilots, 1);
        else if (flightDuration <= 16 * 60)
            return Math.max(minNumOfPilots, 2);
        else if (flightDuration <= 30 * 60)
            return Math.max(minNumOfPilots, 4);
        else return 0;
    }

    /**
     * return the min number of pilots needed for a flight duration
     *
     * @param minNumOfPilots
     * @param flightDuration
     * @return min number of pilots
     */
    public static int minNumberOfPilotsForFlight(int minNumOfPilots, int flightDuration, LocalDateTime start) {

        if (start != null && start.getHour() < 8 && start.getHour() >= 5 && flightDuration <= 9 * 60)
            return Math.max(minNumOfPilots, 1);
        else if (flightDuration <= 8 * 60)
            return Math.max(minNumOfPilots, 1);
        else if (flightDuration <= 8 * 60)
            return Math.max(minNumOfPilots, 2);
        else if (flightDuration <= 12 * 60)
            return Math.max(minNumOfPilots, 3);
        else if (flightDuration <= 16 * 60)
            return Math.max(minNumOfPilots, 4);
        else return 0;
    }

    /**
     * returns the duration of a rest period given a single flight segment
     *
     * @param newSegment
     * @return rest duration
     */
    public static int getRestDuration(CrewSegments newSegment) {
        int restLength = 0;
        // setting rest periods
        if (newSegment.getActualDuration() < 8 * 60)
            restLength = 9 * 60;
        else if (newSegment.getActualDuration() >= 8 * 60 && newSegment.getActualDuration() < 9 * 60)
            restLength = 10 * 60;
        else if (newSegment.getActualDuration() > 9 * 60)
            restLength = 11 * 60;
        //rest periods for international flights
        if (newSegment.getActualDuration() > 8 * 60 && newSegment.isInternational())
            restLength = 18 * 60;
        else if (newSegment.isInternational())
            restLength = newSegment.getEstimatedDuration() * 2;
        return restLength;
    }

    /**
     * returns the duration of a rest period given a single flight segment
     *
     * @param minNumberOfPilots
     * @return flightLength
     */
    public static int getFlightHours(int minNumberOfPilots) {

        // setting rest periods

        if (minNumberOfPilots == 1)
            return   9 * 60;
        else if (minNumberOfPilots == 2)
            return 9 * 60;
        else if (minNumberOfPilots == 3)
            return 12* 60;
        else if (minNumberOfPilots == 4)
            return 20* 60;
        return 0;
    }

    /**
     * returns the duration of a rest period given a group of flight segments
     *
     * @param crewSegmentsList
     * @param newSegment
     * @param startDutyTime
     * @param endDutyTime
     * @return rest duration
     */
    public static int getRestDuration(List<CrewSegments> crewSegmentsList, CrewSegments newSegment, LocalDateTime startDutyTime, LocalDateTime endDutyTime) {

        int restLength = 0;
        int flightDurations = crewSegmentsList.stream().filter(c -> c.getActualStartTime().isAfter(startDutyTime)
                && c.getActualStartTime().isBefore(endDutyTime)
                && c.getActualEndTime().isBefore(endDutyTime)).mapToInt(CrewSegments::getActualDuration).sum();

        if (flightDurations + newSegment.getActualDuration() < 8 * 60)
            restLength = 9 * 60;
        else if (flightDurations + newSegment.getActualDuration() >= 8 * 60 && flightDurations + newSegment.getActualDuration() < 9 * 60)
            restLength = 10 * 60;
        else if (flightDurations + newSegment.getActualDuration() > 9 * 60)
            restLength = 11 * 60;
        //rest periods for international flights
        if (flightDurations + newSegment.getActualDuration() > 8 * 60 && newSegment.isInternational())
            restLength = 18 * 60;
        else if (newSegment.isInternational())
            restLength = newSegment.getEstimatedDuration() * 2;

        return restLength;
    }
}