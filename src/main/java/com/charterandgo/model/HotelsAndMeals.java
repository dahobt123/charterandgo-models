package com.charterandgo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelsAndMeals implements Serializable {

    private int id;
    private String charterSupplierId;
    private BigDecimal hotel1 = new BigDecimal("0.00");
    private BigDecimal hotel2 = new BigDecimal("0.00");
    private BigDecimal hotel3 = new BigDecimal("0.00");
    private BigDecimal hotel4 = new BigDecimal("0.00");
    private BigDecimal hotel5 = new BigDecimal("0.00");
    private BigDecimal meal1 = new BigDecimal("0.00");
    private BigDecimal meal2 = new BigDecimal("0.00");
    private BigDecimal meal3 = new BigDecimal("0.00");
    private BigDecimal meal4 = new BigDecimal("0.00");
    private BigDecimal meal5 = new BigDecimal("0.00");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharterSupplierId() {
        return charterSupplierId;
    }

    public void setCharterSupplierId(String charterSupplierId) {
        this.charterSupplierId = charterSupplierId;
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

    public BigDecimal getHotel5() {
        return hotel5;
    }

    public void setHotel5(BigDecimal hotel5) {
        this.hotel5 = hotel5;
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
}
