package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Crew implements Serializable {

    private int pilotID;
    private int crewprofileid;
    private String firstName;
    private String lastName;
    private double maxHours;
    private double accruingHours;
    private boolean isPilot;
    private int charterId;
    private String crewType;
    private String crewStatus;
    private String manufacturer;
    private String model;


    public Crew() {

    }
    public Crew(String crewType){
        this.crewType = crewType;
    }

    public Crew(int pilotID, int crewprofileid, String firstName, String lastName, double maxHours, double accruingHours, boolean isPilot, int charterId, String crewType, String crewStatus) {
        this.pilotID = pilotID;
        this.crewprofileid = crewprofileid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxHours = maxHours;
        this.accruingHours = accruingHours;
        this.isPilot = isPilot;
        this.charterId = charterId;
        this.crewType = crewType;
        this.crewStatus = crewStatus;
    }

    public Crew(int pilotID, String firstName, String lastName, double maxHours, double accruingHours, boolean isPilot, int charterId, String crewType, String crewStatus) {
        this.pilotID = pilotID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxHours = maxHours;
        this.accruingHours = accruingHours;
        this.isPilot = isPilot;
        this.charterId = charterId;
        this.crewType = crewType;
        this.crewStatus = crewStatus;
    }

    public Crew( String firstName, String lastName, double maxHours, double accruingHours, boolean isPilot, int charterId, String crewType, String crewStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxHours = maxHours;
        this.accruingHours = accruingHours;
        this.isPilot = isPilot;
        this.charterId = charterId;
        this.crewType = crewType;
        this.crewStatus = crewStatus;
    }

    public Crew(String crewType, int crewprofileid, int charterId) {
        this.crewType = crewType;
        this.crewprofileid = crewprofileid;
        this.charterId  = charterId;
    }

    public Crew(int crewprofileid, String crewType) {
        this.crewprofileid = crewprofileid;
        this.crewType = crewType;
    }

    public Crew(int charterId,String manufacturer,String model){
        this.charterId = charterId;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "pilotID=" + pilotID +
                ", crewprofileid=" + crewprofileid +
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
        obj.put("crewprofileid", crewprofileid);
        return obj;
    }

    public int getPilotID() {
        return pilotID;
    }

    public void setPilotID(int pilotID) {
        this.pilotID = pilotID;
    }

    public int getcrewprofileid() {
        return crewprofileid;
    }

    public void setcrewprofileid(int crewprofileid) {
        this.crewprofileid = crewprofileid;
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

    public String getCrewStatus() {

        return crewStatus;
    }

    public void setCrewStatus(String crewStatus) {
        this.crewStatus = crewStatus;
    }

    public int getCrewprofileid() {
        return crewprofileid;
    }

    public void setCrewprofileid(int crewprofileid) {
        this.crewprofileid = crewprofileid;
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
}
