package com.charterandgo.model;



import com.charterandgo.charterhelpers.DateHelper;

import java.math.BigDecimal;
import java.util.Date;

public class Segment implements Cloneable {

    private int id;
    private String tailNumber;
    private String origin;
    private String destination;
    private Date departure;
    private Date arrival;
    private String actionCode;
    private String oldActionCode;
    private String owner;
    private int seatsSold;
    private BigDecimal cargoSold = new BigDecimal(0.00);
    private int duration;

    public Segment() {

    }

    public String toString() {
        return tailNumber + "-" + origin + "-" + destination + "-" + DateHelper.formatIsoTimestamp(departure) + "-" +
                DateHelper.formatIsoTimestamp(arrival) + "-" + actionCode + "-" + (oldActionCode != null ? oldActionCode : "" ) + "-" +
                (owner!= null ? owner : "") + "-" + seatsSold + "-" + cargoSold.toString() + "-" + duration;
    }

    public boolean equals(Segment other) {
        if (other.getTailNumber().equals(tailNumber) &&
                other.getOrigin().equals(origin) &&
                other.getDestination().equals(destination) &&
                other.getDeparture().compareTo(departure) == 0 &&
                other.getArrival().compareTo(arrival) == 0) {
            return true;
        }
        return false;
    }


    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getOldActionCode() {
        return oldActionCode;
    }

    public void setOldActionCode(String oldActionCode) {
        this.oldActionCode = oldActionCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSeatsSold() {
        return seatsSold;
    }

    public void setSeatsSold(int seatsSold) {
        this.seatsSold = seatsSold;
    }

    public BigDecimal getCargoSold() {
        return cargoSold;
    }

    public void setCargoSold(BigDecimal cargoSold) {
        this.cargoSold = cargoSold;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
