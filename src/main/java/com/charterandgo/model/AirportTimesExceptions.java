package com.charterandgo.model;

import com.charterandgo.charterhelpers.DateHelper;
import org.json.JSONObject;

import java.util.Date;

public class AirportTimesExceptions {

    private int id;
    private String siteNumber;
    private String locId;
    private Date eventDate;
    private String openTime;
    private String closingTime;
    private boolean closedForRepairs;
    private boolean openAllHolidays;

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("id", id);
        obj.put("siteNumber", siteNumber);
        obj.put("locId", locId);
        obj.put("eventDate", DateHelper.formatIsoDate(eventDate));
        obj.put("openTime", openTime);
        obj.put("closingTime", closingTime);
        obj.put("closedForRepairs", closedForRepairs);
        obj.put("openAllHolidays", openAllHolidays);
        return obj;
    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isClosedForRepairs() {
        return closedForRepairs;
    }

    public void setClosedForRepairs(boolean closedForRepairs) {
        this.closedForRepairs = closedForRepairs;
    }

    public boolean isOpenAllHolidays() {
        return openAllHolidays;
    }

    public void setOpenAllHolidays(boolean openAllHolidays) {
        this.openAllHolidays = openAllHolidays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
