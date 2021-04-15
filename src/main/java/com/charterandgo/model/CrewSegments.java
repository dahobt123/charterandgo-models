package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CrewSegments implements Serializable {
    private int crewProfileId;
    private int estimatedDuration;
    private int actualDuration;
    private int orderID;
    private int turnAroundTime;
    private int charterSupplierId;
    private int lastUpdatedBy;
    private int orderItemId;
    private int UID;
    private int linkedFromOrder;
    private int linkedToOrder;
    private int linkedFromOrderItem;
    private int linkedToOrderItem;
    private int flightPartType;
    private int numberOfCrew;
    private LocalDateTime lastUpdated;
    private LocalDateTime estimatedStartTime;
    private LocalDateTime estimatedEndTime;
    private LocalDateTime actualStartTime;
    private LocalDateTime actualEndTime;
    private String destination;
    private String departure;
    private String orderStatus;
    private String orderSubStatus;
    private String originCountry;
    private String destinationCountry;
    private String originCity;
    private String destinationCity;
    private String originState;
    private String orderReference;
    private String destinationState;
    private String segmentType;  // plane status (empty leg, repostition)
    private String tailNumber;
    private String crewRole;  // pilot, co pilot, plane prep?...
    private String manufacturer;
    private String model;
    private ZoneId zoneId;
    private String timeZone;
    private String flightType;
    private String tripType;
    private boolean overRideFlag;
    private boolean international;

    public CrewSegments(int crewProfileId, LocalDateTime actualStartTime, LocalDateTime actualEndTime, String destinationAirportCode, String departureAirportCode, String segmentType, String tailNumber, int orderID, String crewRole, int charterSupplierId, int actualDuration) {
        this.crewProfileId = crewProfileId;
        this.actualStartTime = actualStartTime;
        this.actualEndTime = actualEndTime;
        this.destination = destinationAirportCode;
        this.departure = departureAirportCode;
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

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getLinkedFromOrder() {
        return linkedFromOrder;
    }

    public void setLinkedFromOrder(int linkedFromOrder) {
        this.linkedFromOrder = linkedFromOrder;
    }

    public int getLinkedToOrder() {
        return linkedToOrder;
    }

    public void setLinkedToOrder(int linkedToOrder) {
        this.linkedToOrder = linkedToOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderSubStatus() {
        return orderSubStatus;
    }

    public void setOrderSubStatus(String orderSubStatus) {
        this.orderSubStatus = orderSubStatus;
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

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public int getLinkedFromOrderItem() {
        return linkedFromOrderItem;
    }

    public void setLinkedFromOrderItem(int linkedFromOrderItem) {
        this.linkedFromOrderItem = linkedFromOrderItem;
    }

    public int getLinkedToOrderItem() {
        return linkedToOrderItem;
    }

    public void setLinkedToOrderItem(int linkedToOrderItem) {
        this.linkedToOrderItem = linkedToOrderItem;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
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
        obj.put("turnAroundTime", turnAroundTime);
        obj.put("linedOrderFrom", linkedFromOrder);
        obj.put("linedOrderTo", linkedToOrder);
        obj.put("orderStatus", orderStatus);
        obj.put("orderSubStatus", orderSubStatus);
        obj.put("originCountry", originCountry);
        obj.put("destinationCountry", destinationCountry);
        obj.put("originCity", originCity);
        obj.put("turnAroundTime", turnAroundTime);
        obj.put("destinationCity", destinationCity);
        obj.put("originState", originState);
        obj.put("orderReference", orderReference);
        obj.put("destinationState", destinationState);
        obj.put("numberOfCrew", numberOfCrew);
        obj.put("linkedFromOrderItem",linkedFromOrderItem);
        obj.put("linkedToOrderItem", linkedToOrderItem);
        obj.put("tripType", tripType);

        return obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CrewSegments)) return false;
        CrewSegments segments = (CrewSegments) o;
        return crewProfileId == segments.crewProfileId && estimatedDuration == segments.estimatedDuration && actualDuration == segments.actualDuration && orderID == segments.orderID && turnAroundTime == segments.turnAroundTime && charterSupplierId == segments.charterSupplierId && lastUpdatedBy == segments.lastUpdatedBy && orderItemId == segments.orderItemId && UID == segments.UID && linkedFromOrder == segments.linkedFromOrder && linkedToOrder == segments.linkedToOrder && flightPartType == segments.flightPartType && numberOfCrew == segments.numberOfCrew && overRideFlag == segments.overRideFlag && international == segments.international && Objects.equals(lastUpdated, segments.lastUpdated) && Objects.equals(estimatedStartTime, segments.estimatedStartTime) && Objects.equals(estimatedEndTime, segments.estimatedEndTime) && Objects.equals(actualStartTime, segments.actualStartTime) && Objects.equals(actualEndTime, segments.actualEndTime) && Objects.equals(destination, segments.destination) && Objects.equals(departure, segments.departure) && Objects.equals(orderStatus, segments.orderStatus) && Objects.equals(orderSubStatus, segments.orderSubStatus) && Objects.equals(originCountry, segments.originCountry) && Objects.equals(destinationCountry, segments.destinationCountry) && Objects.equals(originCity, segments.originCity) && Objects.equals(destinationCity, segments.destinationCity) && Objects.equals(originState, segments.originState) && Objects.equals(orderReference, segments.orderReference) && Objects.equals(destinationState, segments.destinationState) && Objects.equals(segmentType, segments.segmentType) && Objects.equals(tailNumber, segments.tailNumber) && Objects.equals(crewRole, segments.crewRole) && Objects.equals(manufacturer, segments.manufacturer) && Objects.equals(model, segments.model) && Objects.equals(zoneId, segments.zoneId) && Objects.equals(timeZone, segments.timeZone) && Objects.equals(flightType, segments.flightType);
    }

    public List<String> findDifference(CrewSegments segments) {
        List<String> difference = new ArrayList<>();
        if (crewProfileId != segments.crewProfileId)
            difference.add("crewProfileId");
        if (estimatedDuration != segments.estimatedDuration)
            difference.add("estimatedDuration");
        if (actualDuration != segments.actualDuration)
            difference.add("actualDuration");
        if (orderID != segments.orderID)
            difference.add("orderID");
        if (turnAroundTime != segments.turnAroundTime)
            difference.add("turnAroundTime");
        if (charterSupplierId != segments.charterSupplierId)
            difference.add("charterSupplierId");
        if (lastUpdatedBy != segments.lastUpdatedBy)
            difference.add("lastUpdatedBy");
        if (orderItemId != segments.orderItemId)
            difference.add("orderItemId");
        if (UID != segments.UID)
            difference.add("UID");
        if (linkedFromOrder != segments.linkedFromOrder)
            difference.add("linkedFromOrder");
        if (linkedToOrder != segments.linkedToOrder)
            difference.add("linkedToOrder");
        if (linkedFromOrderItem != segments.linkedFromOrderItem)
            difference.add("linkedFromOrderItem");
        if (linkedToOrderItem != segments.linkedToOrderItem)
            difference.add("linkedToOrderItem");
        if (flightPartType != segments.flightPartType)
            difference.add("flightPartType");
        if (numberOfCrew != segments.numberOfCrew)
            difference.add("numberOfCrew");
        if (overRideFlag != segments.overRideFlag)
            difference.add("overRideFlag");
        if (international != segments.international)
            difference.add("international");
        if (!lastUpdated.equals(segments.lastUpdated))
            difference.add("lastUpdated");
        if (!estimatedStartTime.equals(segments.estimatedStartTime))
            difference.add("estimatedStartTime");
        if (!estimatedEndTime.equals(segments.estimatedEndTime))
            difference.add("estimatedEndTime");
        if (!actualStartTime.equals(segments.actualStartTime))
            difference.add("actualStartTime");
        if (!actualEndTime.equals(segments.actualEndTime))
            difference.add("actualEndTime");
        if (!destination.equals(segments.destination))
            difference.add("destinationAirportCode");
        if (!departure.equals(segments.departure))
            difference.add("departureAirportCode");
        if (!orderStatus.equals(segments.orderStatus))
            difference.add("orderStatus");
        if (!orderSubStatus.equals(segments.orderSubStatus))
            difference.add("orderSubStatus");
        if (!originCountry.equals(segments.originCountry))
            difference.add("originCountry");
        if (!destinationCountry.equals(segments.destinationCountry))
            difference.add("destinationCountry");
        if (!originCity.equals(segments.originCity))
            difference.add("originCity");
        if (!destinationCity.equals(segments.destinationCity))
            difference.add("destinationCity");
        if (!originState.equals(segments.originState))
            difference.add("originState");
        if (!orderReference.equals(segments.orderReference))
            difference.add("orderReference");
        if (!destinationState.equals(segments.destinationState))
            difference.add("destinationState");
        if (!segmentType.equals(segments.segmentType))
            difference.add("segmentType");
        if (!tailNumber.equals(segments.tailNumber))
            difference.add("tailNumber");
        if (! crewRole.equals(segments.crewRole))
            difference.add("crewRole");
        if (! manufacturer.equals(segments.manufacturer))
            difference.add("manufacturer");
        if (!model.equals(segments.model) )
            difference.add("model");
        if (!zoneId.equals(segments.zoneId))
            difference.add("zoneId");
        if (!timeZone.equals(segments.timeZone))
            difference.add("timeZone");
        if (!flightType.equals(segments.flightType))
            difference.add("flightType");
        if(!tripType.equals(segments.tripType))
            difference.add("tripType");

        return difference;
    }

    @Override
    public int hashCode() {
        return Objects.hash(crewProfileId, estimatedDuration, actualDuration, orderID, turnAroundTime, charterSupplierId, lastUpdatedBy, orderItemId, UID, linkedFromOrder, linkedToOrder, flightPartType, numberOfCrew, lastUpdated, estimatedStartTime, estimatedEndTime, actualStartTime, actualEndTime, destination, departure, orderStatus, orderSubStatus, originCountry, destinationCountry, originCity, destinationCity, originState, orderReference, destinationState, segmentType, tailNumber, crewRole, manufacturer, model, zoneId, timeZone, flightType, overRideFlag, international);
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
                ", overRideFlag=" + overRideFlag +
                ", flightPartType=" + flightPartType +
                ", international=" + international +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", UID=" + UID +
                ", orderItemId=" + orderItemId +
                ", zoneId=" + zoneId +
                ", timeZone='" + timeZone + '\'' +
                ", flightType='" + flightType + '\'' +
                '}';
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
            return 9 * 60;
        else if (minNumberOfPilots == 2)
            return 9 * 60;
        else if (minNumberOfPilots == 3)
            return 12 * 60;
        else if (minNumberOfPilots == 4)
            return 20 * 60;
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