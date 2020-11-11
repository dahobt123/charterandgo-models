package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

public class Crew implements Serializable {

    private int crewProfileId;
    private int pilotID;
    private double maxHoursAWeek;
    private boolean isPilot;
    private String firstName;
    private String lastName;
    private int charterProfileId;
    private String experience;
    private double expectedDailyHours;
    private double expectedWeeklyHours;
    private double expectedMonthlyHours;
    private double expectedYearlyHours;
    private double actualDailyHours;
    private double actualWeeklyHours;
    private double actualMonthlyHours;
    private double actualYearlyHours;
    private String homeBase;
    private String crewRole;
    private String crewStatus;
    private String manufacturer;
    private String model;
    private List<CrewCertifications> crewCerts;
    private List<RichMedia> richMedia;
    private List<CrewSegments> segments;
    public Crew() {

    }
    public Crew(String crewRole){
        this.crewRole = crewRole;
    }

//    public Crew(int pilotID, int crewProfileId, String firstName, String lastName, double maxHours, double dailyHours, boolean isPilot, int charterId, String crewRole, String crewStatus) {
//        this.pilotID = pilotID;
//        this.crewProfileId = crewProfileId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.maxHours = maxHours;
//        this.dailyHours = dailyHours;
//        this.isPilot = isPilot;
//        this.charterId = charterId;
//        this.crewRole = crewRole;
//        this.crewStatus = crewStatus;
//    }
//
//    public Crew(int pilotID, String firstName, String lastName, double maxHours, double dailyHours, boolean isPilot, int charterId, String crewRole, String crewStatus) {
//        this.pilotID = pilotID;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.maxHours = maxHours;
//        this.dailyHours = dailyHours;
//        this.isPilot = isPilot;
//        this.charterId = charterId;
//        this.crewRole = crewRole;
//        this.crewStatus = crewStatus;
//    }
//
//    public Crew( String firstName, String lastName, double maxHours, double dailyHours, boolean isPilot, int charterId, String crewRole, String crewStatus) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.maxHours = maxHours;
//        this.dailyHours = dailyHours;
//        this.isPilot = isPilot;
//        this.charterId = charterId;
//        this.crewRole = crewRole;
//        this.crewStatus = crewStatus;
//    }
//
//    public Crew(String crewRole, int crewProfileId, int charterId) {
//        this.crewRole = crewRole;
//        this.crewProfileId = crewProfileId;
//        this.charterId  = charterId;
//    }

    public Crew(int crewProfileId, String crewRole) {
        this.crewProfileId = crewProfileId;
        this.crewRole = crewRole;
    }

    public Crew(int crewProfileId, int pilotID, String firstName, String lastName, String homeBase) {
        this.crewProfileId = crewProfileId;
        this.pilotID = pilotID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeBase = homeBase;
    }
    //    public Crew(int charterId,String manufacturer,String model){
//        this.charterId = charterId;
//        this.manufacturer = manufacturer;
//        this.model = model;
//    }
//
//    // this is for HTTP yaml
//    public Crew(int crewProfileId, String firstName, String lastName, double dailyHours, double weeklyHours, double monthlyHours, double yearlyHours, List<RichMedia> richMedia, List<CrewCertifications> crewCerts, List<CrewSegments> segments){
//        this.crewProfileId = crewProfileId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dailyHours = dailyHours;
//        this.weeklyHours = weeklyHours;
//        this.monthlyHours = monthlyHours;
//        this.yearlyHours = yearlyHours;
//        this.richmedia = richMedia;
//        this.crewCerts = crewCerts;
//        this.segments = segments;
//
//    }



    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewRole", crewRole);
        obj.put("crewProfileId", crewProfileId);
        return obj;
    }

    public JSONObject httpToJson(){
        JSONObject obj = new JSONObject();
        obj.put("crewProfileId", crewProfileId);
        obj.put("firstName", firstName);
        obj.put("lastName", lastName);
        obj.put("dailyHours", actualDailyHours);
        obj.put("weeklyHours", actualWeeklyHours);
        obj.put("monthlyHours", actualMonthlyHours);
        obj.put("yearlyHours", actualYearlyHours);
        JSONArray mediaArray = new JSONArray();
        for (RichMedia media: richMedia){
            mediaArray.put(media.toJson());
        }
        obj.put("richmedia", mediaArray);

        JSONArray certArray = new JSONArray();
        for(CrewCertifications certs: crewCerts){
            certArray.put(certs);
        }
        obj.put("crewCerts", certArray);
        JSONArray segmentArray = new JSONArray();
        for(CrewSegments segments: segments){
            segmentArray.put(segments.toJson());
        }
        obj.put("segments", segmentArray);

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

    public void setExpectedDailyHours(double expectedDailyHours) {
        this.expectedDailyHours = expectedDailyHours;
    }

    public double getExpectedWeeklyHours() {
        return expectedWeeklyHours;
    }

    public void setExpectedWeeklyHours(double expectedWeeklyHours) {
        this.expectedWeeklyHours = expectedWeeklyHours;
    }

    public double getExpectedMonthlyHours() {
        return expectedMonthlyHours;
    }

    public void setExpectedMonthlyHours(double expectedMonthlyHours) {
        this.expectedMonthlyHours = expectedMonthlyHours;
    }

    public double getExpectedYearlyHours() {
        return expectedYearlyHours;
    }

    public void setExpectedYearlyHours(double expectedYearlyHours) {
        this.expectedYearlyHours = expectedYearlyHours;
    }

    public double getActualWeeklyHours() {
        return actualWeeklyHours;
    }

    public void setActualWeeklyHours(double actualWeeklyHours) {
        this.actualWeeklyHours = actualWeeklyHours;
    }

    public double getActualMonthlyHours() {
        return actualMonthlyHours;
    }

    public void setActualMonthlyHours(double actualMonthlyHours) {
        this.actualMonthlyHours = actualMonthlyHours;
    }

    public double getActualYearlyHours() {
        return actualYearlyHours;
    }

    public void setActualYearlyHours(double actualYearlyHours) {
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

    public void setActualDailyHours(double actualDailyHours) {
        this.actualDailyHours = actualDailyHours;
    }
}
