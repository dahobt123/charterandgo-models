package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Capacities {

    private int id;
    private String tailNumber;
    private Date start;
    private Date end;
    private BigDecimal cargoCapacity;
    private int paxCapacity;

    public Capacities() {

    }
    public Capacities(Date start, Date end, BigDecimal cargo, int pax) {
        this.start = start;
        this.end = end;
        cargoCapacity = cargo;
        paxCapacity = pax;
    }

    public BigDecimal getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(BigDecimal cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getPaxCapacity() {
        return paxCapacity;
    }

    public void setPaxCapacity(int paxCapacity) {
        this.paxCapacity = paxCapacity;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }
}
