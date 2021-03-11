package com.charterandgo.model;


import org.json.JSONObject;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CrewCertifications implements Serializable {
    private int crewProfileId;
    private String firstName;
    private String lastName;
    private String manufacture;
    private String model;
    private String certificationType;
    private String crewRole;
    private int charterProfileId;
    private int certificationId;
    private String certificationName;
    private LocalDateTime certificationStartDate;
    private LocalDateTime certificationExpirationDate;
    private String tailNumber;
    private double hoursFlownAsPIC;
    private double hoursFlownAsSIC;
    private LocalDateTime lastUpdated;
    private int lastUpdatedBy;
    private String aircraftType;
    private int UID;

    public CrewCertifications() {
    }


    public CrewCertifications(int crewProfileId, String manufacture, String model, String certificationType, String crewRole, int certificationId, String certificationName, LocalDateTime certificationStartDate, LocalDateTime certificationExpirationDate, String tailNumber, double hoursFlownAsPIC, double hoursFlownAsSIC, LocalDateTime lastUpdated, String aircraftType, int uId) {
        this.crewProfileId = crewProfileId;
        this.manufacture = manufacture;
        this.model = model;
        this.certificationType = certificationType;
        this.crewRole = crewRole;
        this.certificationId = certificationId;
        this.certificationName = certificationName;
        this.certificationStartDate = certificationStartDate;
        this.certificationExpirationDate = certificationExpirationDate;
        this.tailNumber = tailNumber;
        this.hoursFlownAsPIC = hoursFlownAsPIC;
        this.hoursFlownAsSIC = hoursFlownAsSIC;
        this.lastUpdated = lastUpdated;
        this.aircraftType = aircraftType;
    }

    public int getCrewProfileId() {
        return crewProfileId;
    }

    public void setCrewProfileId(int crewProfileId) {
        this.crewProfileId = crewProfileId;
    }

    public String getManufacture() {
        return manufacture;
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

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCertificationType() {
        return certificationType;
    }

    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }

    public String getCrewRole() {
        return crewRole;
    }

    public void setCrewRole(String crewRole) {
        this.crewRole = crewRole;
    }

    public int getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(int certificationId) {
        this.certificationId = certificationId;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public LocalDateTime getCertificationStartDate() {
        return certificationStartDate;
    }

    public void setCertificationStartDate(LocalDateTime certificationStartDate) {
        this.certificationStartDate = certificationStartDate;
    }

    public LocalDateTime getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    public void setCertificationExpirationDate(LocalDateTime certificationExpirationDate) {
        this.certificationExpirationDate = certificationExpirationDate;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public double getHoursFlownAsPIC() {
        return hoursFlownAsPIC;
    }

    public void setHoursFlownAsPIC(double hoursFlownAsPIC) {
        this.hoursFlownAsPIC = hoursFlownAsPIC;
    }

    public double getHoursFlownAsSIC() {
        return hoursFlownAsSIC;
    }

    public void setHoursFlownAsSIC(double hoursFlownAsSIC) {
        this.hoursFlownAsSIC = hoursFlownAsSIC;
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

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getCharterProfileId() {
        return charterProfileId;
    }

    public void setCharterProfileId(int charterProfileId) {
        this.charterProfileId = charterProfileId;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    @Override
    public String toString() {
        return "CrewCertifications{" +
                "crewProfileId=" + crewProfileId +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", certificationType=" + certificationType +
                ", crewRole='" + crewRole + '\'' +
                ", certificationId=" + certificationId +
                ", certificationName='" + certificationName + '\'' +
                ", certificationStartDate=" + certificationStartDate +
                ", certificationExpirationDate=" + certificationExpirationDate +
                ", tailNumber='" + tailNumber + '\'' +
                ", hoursFlownAsPIC=" + hoursFlownAsPIC +
                ", hoursFlownAsSIC=" + hoursFlownAsSIC +
                ", lastUpdated=" + lastUpdated +
                ", aircraftType='" + aircraftType + '\'' +
                '}';
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("crewProfileId", crewProfileId);
        obj.put("firstName", firstName);
        obj.put("lastName", lastName);
        obj.put("charterProfileId", charterProfileId);
        obj.put("manufacture", manufacture);
        obj.put("model", model);
        obj.put("certificationType", certificationType);
        obj.put("crewRole", crewRole);
        obj.put("certificationId", certificationId);
        obj.put("certificationName", certificationName);
        obj.put("certificationStartDate", certificationStartDate);
        obj.put("certificationExpirationDate", certificationExpirationDate);
        obj.put("TailNumber", tailNumber);
        obj.put("hoursFlownAsPIC", hoursFlownAsPIC);
        obj.put("hoursFlownAsSIC", hoursFlownAsSIC);
        obj.put("lastUpdated", lastUpdated);
        obj.put("lastUpdatedBy", lastUpdatedBy);
        obj.put("aircraftType", aircraftType);
        obj.put("UId", UID);


        return obj;

    }
}
