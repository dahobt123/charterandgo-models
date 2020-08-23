package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class CabinCosts {

    public CabinCosts() {
        
    }

    private String jetCategory;
    private BigDecimal catering = new BigDecimal("0.00");
    private BigDecimal cleaning = new BigDecimal("0.00");;
    private BigDecimal empSalaries = new BigDecimal("0.00");;
    private BigDecimal empBenefits = new BigDecimal("0.00");;
    private BigDecimal empTraining = new BigDecimal("0.00");;
    private BigDecimal fltAttendants = new BigDecimal("0.00");;
    private BigDecimal hotel1 = new BigDecimal("0.00");;
    private BigDecimal hotel2 = new BigDecimal("0.00");;
    private BigDecimal hotel3 = new BigDecimal("0.00");;
    private BigDecimal hotel4 = new BigDecimal("0.00");;
    private BigDecimal hotel5 = new BigDecimal("0.00");;
    private BigDecimal meal1 = new BigDecimal("0.00");;
    private BigDecimal meal2 = new BigDecimal("0.00");;
    private BigDecimal meal3 = new BigDecimal("0.00");;
    private BigDecimal meal4 = new BigDecimal("0.00");;
    private BigDecimal meal5 = new BigDecimal("0.00");;
    private Date lastupdated;

    public String getJetCategory() {
        return jetCategory;
    }

    public void setJetCategory(String jetCategory) {
        this.jetCategory = jetCategory;
    }

    public BigDecimal getCatering() {
        return catering;
    }

    public void setCatering(BigDecimal catering) {
        this.catering = catering;
    }

    public BigDecimal getCleaning() {
        return cleaning;
    }

    public void setCleaning(BigDecimal cleaning) {
        this.cleaning = cleaning;
    }

    public BigDecimal getEmpSalaries() {
        return empSalaries;
    }

    public void setEmpSalaries(BigDecimal empSalaries) {
        this.empSalaries = empSalaries;
    }

    public BigDecimal getEmpBenefits() {
        return empBenefits;
    }

    public void setEmpBenefits(BigDecimal empBenefits) {
        this.empBenefits = empBenefits;
    }

    public BigDecimal getEmpTraining() {
        return empTraining;
    }

    public void setEmpTraining(BigDecimal empTraining) {
        this.empTraining = empTraining;
    }

    public BigDecimal getHotel1() {
        return hotel1;
    }

    public void setHotel1(BigDecimal hotel1) {
        this.hotel1 = hotel1;
    }

    public BigDecimal getHotel2() {
        return hotel2;
    }

    public void setHotel2(BigDecimal hotel2) {
        this.hotel2 = hotel2;
    }

    public BigDecimal getHotel3() {
        return hotel3;
    }

    public void setHotel3(BigDecimal hotel3) {
        this.hotel3 = hotel3;
    }

    public BigDecimal getHotel4() {
        return hotel4;
    }

    public void setHotel4(BigDecimal hotel4) {
        this.hotel4 = hotel4;
    }

    public BigDecimal getMeal1() {
        return meal1;
    }

    public void setMeal1(BigDecimal meal1) {
        this.meal1 = meal1;
    }

    public BigDecimal getMeal2() {
        return meal2;
    }

    public void setMeal2(BigDecimal meal2) {
        this.meal2 = meal2;
    }

    public BigDecimal getMeal3() {
        return meal3;
    }

    public void setMeal3(BigDecimal meal3) {
        this.meal3 = meal3;
    }

    public BigDecimal getMeal4() {
        return meal4;
    }

    public void setMeal4(BigDecimal meal4) {
        this.meal4 = meal4;
    }

    public BigDecimal getMeal5() {
        return meal5;
    }

    public void setMeal5(BigDecimal meal5) {
        this.meal5 = meal5;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    public BigDecimal getFltAttendants() {
        return fltAttendants;
    }

    public void setFltAttendants(BigDecimal fltAttendants) {
        this.fltAttendants = fltAttendants;
    }

    public BigDecimal getHotel5() {
        return hotel5;
    }

    public void setHotel5(BigDecimal hotel5) {
        this.hotel5 = hotel5;
    }
}
