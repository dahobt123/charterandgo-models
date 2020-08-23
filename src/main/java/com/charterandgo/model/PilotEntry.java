package com.charterandgo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PilotEntry implements Serializable {

    private String uniqueId;
    private String firstAndMiddleName;
    private String lastNameAndSuffix;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String countryName;
    private String region;
    private String medicalClass;
    private Date medicalDate;
    private Date expiry;
    private Date basicMedCourseDate;
    private Date basicMedCmecDate;

    //  Certificates file

    private String recordType;
    private String certificateType;
    private String certificatelevel;
    private Date certificateExpiry;
    private List<String> ratings = new ArrayList<>();

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFirstAndMiddleName() {
        return firstAndMiddleName;
    }

    public void setFirstAndMiddleName(String firstAndMiddleName) {
        this.firstAndMiddleName = firstAndMiddleName;
    }

    public String getLastNameAndSuffix() {
        return lastNameAndSuffix;
    }

    public void setLastNameAndSuffix(String lastNameAndSuffix) {
        this.lastNameAndSuffix = lastNameAndSuffix;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMedicalClass() {
        return medicalClass;
    }

    public void setMedicalClass(String medicalClass) {
        this.medicalClass = medicalClass;
    }

    public Date getMedicalDate() {
        return medicalDate;
    }

    public void setMedicalDate(Date medicalDate) {
        this.medicalDate = medicalDate;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Date getBasicMedCourseDate() {
        return basicMedCourseDate;
    }

    public void setBasicMedCourseDate(Date basicMedCourseDate) {
        this.basicMedCourseDate = basicMedCourseDate;
    }

    public Date getBasicMedCmecDate() {
        return basicMedCmecDate;
    }

    public void setBasicMedCmecDate(Date basicMedCmecDate) {
        this.basicMedCmecDate = basicMedCmecDate;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificatelevel() {
        return certificatelevel;
    }

    public void setCertificatelevel(String certificatelevel) {
        this.certificatelevel = certificatelevel;
    }

    public Date getCertificateExpiry() {
        return certificateExpiry;
    }

    public void setCertificateExpiry(Date certificateExpiry) {
        this.certificateExpiry = certificateExpiry;
    }

    public List<String> getRatings() {
        return ratings;
    }

    public void setRatings(List<String> ratings) {
        this.ratings = ratings;
    }

    public void addRating(String rating) {
        ratings.add(rating);
    }
}





