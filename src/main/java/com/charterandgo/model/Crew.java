package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Crew implements Serializable {

    private int crewProfileId;
    private int pilotID;
    private double maxHoursAWeek;
    private boolean isPilot;
    private String firstName;
    private String lastName;
    private int charterProfileId;
    private String experience;
    private int expectedDailyHours;
    private int expectedWeeklyHours;
    private int expectedMonthlyHours;
    private int expectedYearlyHours;
    private int actualDailyHours;
    private int actualWeeklyHours;
    private int actualMonthlyHours;
    private int actualYearlyHours;
    private int startMonthHours;
    private int endMonthHours;
    private String homeBase;
    private String crewRole;
    private String crewStatus;
    private String manufacturer;
    private String model;
    private String certCrewType;
    private List<CrewCertifications> crewCerts;
    private List<RichMedia> richMedia;
    private List<CrewSegments> segments;
    private String tailNumber;
    public static Logger logger = Logger.getLogger(Crew.class);

    public Crew() {
        BasicConfigurator.configure();
    }




    public Crew(int crewProfileId, String crewRole) {
        this.crewProfileId = crewProfileId;
        this.crewRole = crewRole;
        BasicConfigurator.configure();
    }

    public Crew(int crewProfileId, int pilotID, String firstName, String lastName, String homeBase) {
        this.crewProfileId = crewProfileId;
        this.pilotID = pilotID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeBase = homeBase;
        BasicConfigurator.configure();
    }




    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewRole", crewRole);
        obj.put("crewProfileId", crewProfileId);
        return obj;
    }

    public JSONObject httpToJson(){
        JSONObject obj = new JSONObject();
        obj.put("crewProfileId", crewProfileId);
        obj.put("crewRole", crewRole);
        obj.put("firstName", firstName);
        obj.put("lastName", lastName);
        obj.put("dailyHours", actualDailyHours);
        obj.put("weeklyHours", actualWeeklyHours);
        obj.put("monthlyHours", actualMonthlyHours);
        obj.put("yearlyHours", actualYearlyHours);
        JSONArray segmentArray = new JSONArray();
        for(CrewSegments segment : segments )
            segmentArray.put(segment.toJson());
        obj.put("segments", segments);

//        JSONArray mediaArray = new JSONArray();
//        for (RichMedia media: richMedia){
//            mediaArray.put(media.toJson());
//        }
//        obj.put("richmedia", mediaArray);


//        JSONArray segmentArray = new JSONArray();
//        for(CrewSegments segments: segments){
//            segmentArray.put(segments.toJson());
//        }
//        obj.put("segments", segmentArray);


        return obj;
    }

    public int getCrewProfileId() {
        return crewProfileId;
    }

    public void setCrewProfileId(int crewProfileId) {
        this.crewProfileId = crewProfileId;
    }

    public int getPilotID() {
        return pilotID;
    }

    public void setPilotID(int pilotID) {
        this.pilotID = pilotID;
    }

    public double getMaxHoursAWeek() {
        return maxHoursAWeek;
    }

    public void setMaxHoursAWeek(double maxHoursAWeek) {
        this.maxHoursAWeek = maxHoursAWeek;
    }

    public boolean isPilot() {
        return isPilot;
    }

    public void setPilot(boolean pilot) {
        isPilot = pilot;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCharterProfileId() {
        return charterProfileId;
    }

    public void setCharterProfileId(int charterProfileId) {
        this.charterProfileId = charterProfileId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getExpectedDailyHours() {
        return expectedDailyHours;
    }

    public void setExpectedDailyHours(int expectedDailyHours) {
        this.expectedDailyHours = expectedDailyHours;
    }

    public double getExpectedWeeklyHours() {
        return expectedWeeklyHours;
    }

    public void setExpectedWeeklyHours(int expectedWeeklyHours) {
        this.expectedWeeklyHours = expectedWeeklyHours;
    }

    public double getExpectedMonthlyHours() {
        return expectedMonthlyHours;
    }

    public void setExpectedMonthlyHours(int expectedMonthlyHours) {
        this.expectedMonthlyHours = expectedMonthlyHours;
    }

    public double getExpectedYearlyHours() {
        return expectedYearlyHours;
    }

    public void setExpectedYearlyHours(int expectedYearlyHours) {
        this.expectedYearlyHours = expectedYearlyHours;
    }

    public double getActualWeeklyHours() {
        return actualWeeklyHours;
    }

    public void setActualWeeklyHours(int actualWeeklyHours) {
        this.actualWeeklyHours = actualWeeklyHours;
    }

    public double getActualMonthlyHours() {
        return actualMonthlyHours;
    }

    public void setActualMonthlyHours(int actualMonthlyHours) {
        this.actualMonthlyHours = actualMonthlyHours;
    }

    public double getActualYearlyHours() {
        return actualYearlyHours;
    }

    public void setActualYearlyHours(int actualYearlyHours) {
        this.actualYearlyHours = actualYearlyHours;
    }

    public String getHomeBase() {
        return homeBase;
    }

    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
    }

    public String getCrewRole() {
        return crewRole;
    }

    public void setCrewRole(String crewRole) {
        this.crewRole = crewRole;
    }

    public String getCrewStatus() {
        return crewStatus;
    }

    public void setCrewStatus(String crewStatus) {
        this.crewStatus = crewStatus;
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

    public List<CrewCertifications> getCrewCerts() {
        return crewCerts;
    }

    public void setCrewCerts(List<CrewCertifications> crewCerts) {
        this.crewCerts = crewCerts;
    }

    public List<RichMedia> getRichMedia() {
        return richMedia;
    }

    public void setRichMedia(List<RichMedia> richMedia) {
        this.richMedia = richMedia;
    }

    public List<CrewSegments> getSegments() {
        return segments;
    }

    public void setSegments(List<CrewSegments> segments) {
        this.segments = segments;
    }

    public double getActualDailyHours() {
        return actualDailyHours;
    }

    public void setActualDailyHours(int actualDailyHours) {
        this.actualDailyHours = actualDailyHours;
    }

    public String getCertCrewType() {
        return certCrewType;
    }

    public void setCertCrewType(String certCrewType) {
        this.certCrewType = certCrewType;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public int getStartMonthHours() {
        return startMonthHours;
    }

    public void setStartMonthHours(int startMonthHours) {
        this.startMonthHours = startMonthHours;
    }

    public int getEndMonthHours() {
        return endMonthHours;
    }

    public void setEndMonthHours(int endMonthHours) {
        this.endMonthHours = endMonthHours;
    }
}
