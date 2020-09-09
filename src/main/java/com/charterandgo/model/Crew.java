package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Crew implements Serializable {

    private int pilotID;
    private int profileID;
    private String firstName;
    private String lastName;
    private double maxHours;
    private double accruingHours;
    private boolean isPilot;
    private int charterId;
    private String crewType;


    public Crew() {

    }
    public Crew(String crewType){
        this.crewType = crewType;
    }

    public Crew(int pilotID, int profileID, String firstName, String lastName, double maxHours, double accruingHours, boolean isPilot, int charterId, String crewType) {
        this.pilotID = pilotID;
        this.profileID = profileID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxHours = maxHours;
        this.accruingHours = accruingHours;
        this.isPilot = isPilot;
        this.charterId = charterId;
        this.crewType = crewType;
    }

    public Crew(String crewType, int profileId, int charterId) {
        this.crewType = crewType;
        this.profileID = profileId;
        this.charterId  = charterId;
    }

    public Crew(int pilotID, String crewType) {
        this.pilotID = pilotID;
        this.crewType = crewType;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "pilotID=" + pilotID +
                ", profileID=" + profileID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", maxHours=" + maxHours +
                ", accruingHours=" + accruingHours +
                ", isPilot=" + isPilot +
                ", charterId='" + charterId + '\'' +
                ", crewType='" + crewType + '\'' +
                '}';
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewtype", crewType);
        obj.put("crewprofileid", profileID);
        return obj;
    }

    public int getPilotID() {
        return pilotID;
    }

    public void setPilotID(int pilotID) {
        this.pilotID = pilotID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
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

    public double getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(double maxHours) {
        this.maxHours = maxHours;
    }

    public double getAccruingHours() {
        return accruingHours;
    }

    public void setAccruingHours(double accruingHours) {
        this.accruingHours = accruingHours;
    }

    public boolean isPilot() {
        return isPilot;
    }

    public void setPilot(boolean pilot) {
        isPilot = pilot;
    }

    public int getCharterId() {
        return charterId;
    }

    public void setCharterId(int charterId) {
        this.charterId = charterId;
    }

    public String getCrewType() {
        return crewType;
    }

    public void setCrewType(String crewType) {
        this.crewType = crewType;
    }
}
