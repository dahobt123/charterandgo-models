package com.charterandgo.model;


import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CrewCertifications {

    private int crewProfileId;
    private String manufacture;
    private String model;
    private String certificationType;
    private String crewRole;
    private String crewType;
    private int certificationId;
    private String certificationName;
    private LocalDate certificationStartDate;
    private LocalDate certificationExpirationDate;
    private String tailNumber;
    private double hoursFlownAsPIC;
    private double hoursFlownAsSIC;
    private LocalDateTime lastUpdated;
    private String aircraftType;
    private int UId;

    public CrewCertifications() {
    }


    public CrewCertifications(int crewProfileId, String manufacture, String model, String certificationType, String crewRole, int certificationId, String certificationName, LocalDate certificationStartDate, LocalDate certificationExpirationDate, String tailNumber, double hoursFlownAsPIC, double hoursFlownAsSIC, LocalDateTime lastUpdated, String aircraftType, int uId) {
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
        UId = uId;
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

    public LocalDate getCertificationStartDate() {
        return certificationStartDate;
    }

    public void setCertificationStartDate(LocalDate certificationStartDate) {
        this.certificationStartDate = certificationStartDate;
    }

    public LocalDate getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    public void setCertificationExpirationDate(LocalDate certificationExpirationDate) {
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

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getCrewType() {
        return crewType;
    }

    public void setCrewType(String crewType) {
        this.crewType = crewType;
    }

    public int getUId() {
        return UId;
    }

    public void setUId(int UId) {
        this.UId = UId;
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
        obj.put("certificationType", certificationType);
        obj.put("cewRole", crewRole);
        obj.put("certificationId", certificationId);
        obj.put("certificationName", certificationName);
        obj.put("manufacture", manufacture);
        obj.put("model", model);
        obj.put("TailNumber", tailNumber);
        obj.put("certificationStartDate", certificationStartDate);
        obj.put("hoursFlownAsPIC", hoursFlownAsPIC);
        obj.put("hoursFlownAsSIC", hoursFlownAsSIC);
        obj.put("lastUpdated", lastUpdated);

        return obj;

    }
}
