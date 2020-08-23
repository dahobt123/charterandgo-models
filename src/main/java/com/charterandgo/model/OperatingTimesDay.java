package com.charterandgo.model;


import java.util.Date;

public class OperatingTimesDay implements Cloneable{

    private boolean unattended;
    private boolean onCall;
    private boolean iReg;
    private boolean openHolidays;
    private boolean openFederalHolidays;
    private Date start;
    private Date end;

    public OperatingTimesDay clone() {
        try {
            OperatingTimesDay clone = (OperatingTimesDay) super.clone();
            return clone;
        } catch (CloneNotSupportedException c) {
            return null;
        }
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

    public boolean isUnattended() {
        return unattended;
    }

    public void setUnattended(boolean unattended) {
        this.unattended = unattended;
    }
    public void setOnCall(boolean b) {
        onCall = b;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public boolean isiReg() {
        return iReg;
    }

    public void setiReg(boolean iReg) {
        this.iReg = iReg;
    }

    public boolean isOpenHolidays() {
        return openHolidays;
    }

    public void setOpenHolidays(boolean openHolidays) {
        this.openHolidays = openHolidays;
    }

    public boolean isOpenFederalHolidays() {
        return openFederalHolidays;
    }

    public void setOpenFederalHolidays(boolean openFederalHolidays) {
        this.openFederalHolidays = openFederalHolidays;
    }
}
