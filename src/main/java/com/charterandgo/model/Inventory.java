package com.charterandgo.model;


import java.util.*;

public class Inventory {

    private String charterRegistration;
    private String tailNumber;
    private String homeBase;
    private String make;
    private String model;
//    private List<Capacities> capacities = new ArrayList<>();
    private int turnaroudTime;
    private List<Segment> segments = new ArrayList<>();
    private boolean isAirShare;
    private String aircraftType;
    public static final String MAINTENANCE = "M";
    public static final String AVAILABLE = "A";
    public static final String AVAILABLE_EMPTYLEG = "AE";
    public static final String AVAIlABLE_REPOSITION = "AR";
    public static final String SOLD = "C";
    public static final String SOLD_REPOSITION = "CR";
    public static final String SOLD_EMPTYLEG = "CE";
    public static final String CANCELED = "XX";
    public static final List<String> AVAILABLE_CODES = Arrays.asList(AVAILABLE, AVAILABLE_EMPTYLEG, AVAIlABLE_REPOSITION);
    public static final List<String> UNAVAILABLE_CODES = Arrays.asList(SOLD, SOLD_EMPTYLEG, SOLD_REPOSITION);

    public String getCharterRegistration() {
        return charterRegistration;
    }

    public void setCharterRegistration(String charterRegistration) {
        this.charterRegistration = charterRegistration;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getHomeBase() {
        return homeBase;
    }

    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
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

//    public List<Capacities> getCapacities() {
//        return capacities;
//    }
//
//    public void setCapacities(List<Capacities> capacities) {
//        this.capacities = capacities;
//    }

    public int getTurnaroudTime() {
        return turnaroudTime;
    }

    public void setTurnaroudTime(int turnaroudTime) {
        this.turnaroudTime = turnaroudTime;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public void deleteSlot(Segment seg) {
        this.segments.remove(seg);
    }

    public void addSegment(Segment seg) {
        this.segments.add(seg);
    }

    public boolean isAirShare() {
        return isAirShare;
    }

    public void setAirShare(boolean airShare) {
        isAirShare = airShare;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
}
