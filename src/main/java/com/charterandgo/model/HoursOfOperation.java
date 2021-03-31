package com.charterandgo.model;


import com.charterandgo.charterhelpers.StringUtility;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HoursOfOperation {

    private int id;
    private String siteNumber;
    private String locId;
    private String status;
    private String startMonth;
    private String endMonth;
    private int startDay;
    private int endDay;
    private List<String> applicableDays = new ArrayList<>();
    private String startTime;
    private String endTime;
    private boolean closedHolidays;
    private boolean closedNewYears;
    private boolean closedPresidentsDay;
    private boolean closedMLKDay;
    private boolean closedGoodFriday;
    private boolean closedMemorialDay;
    private boolean closedIndependenceDay;
    private boolean closedLaborDay;
    private boolean closedColumbusDay;
    private boolean closedVeteransDay;
    private boolean closedRemembranceDay;
    private boolean closedThanksGiving;
    private boolean closedThanksGivingAfter;
    private boolean closedChristmasEve;
    private boolean closedChristmasDay;

    public HoursOfOperation() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("id", getId());
        obj.put("siteNumber",siteNumber);
        obj.put("locId",locId);
        obj.put("status",status);
        obj.put("startMonth",startMonth);
        obj.put("endMonth",endMonth);
        obj.put("startDay",startDay);
        obj.put("endDay",endDay);
        JSONArray array = new JSONArray();
        for (String day : applicableDays) {
            array.put(day);
        }
        obj.put("applicableDays", applicableDays);
        obj.put("startTime", startTime);
        obj.put("endTime", endTime);
        obj.put("closedHolidays",closedHolidays);
        obj.put("closedNewYears",closedNewYears);
        obj.put("closedPresidentsDay",closedPresidentsDay);
        obj.put("closedMLKDay",closedMLKDay);
        obj.put("closedGoodFriday",closedGoodFriday);
        obj.put("closedMemorialDay",closedMemorialDay);
        obj.put("closedIndependenceDay",closedIndependenceDay);
        obj.put("closedLaborDay",closedLaborDay);
        obj.put("closedColumbusDay",closedColumbusDay);
        obj.put("closedVeteransDay",closedVeteransDay);
        obj.put("closedRemembranceDay",closedRemembranceDay);
        obj.put("closedThanksGiving",closedThanksGiving);
        obj.put("closedThanksGivingAfter",closedThanksGivingAfter);
        obj.put("closedChristmasEve",closedChristmasEve);
        obj.put("closedChristmasDay",closedChristmasDay);
        return obj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }


    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isClosedHolidays() {
        return closedHolidays;
    }

    public void setClosedHolidays(boolean closedHolidays) {
        this.closedHolidays = closedHolidays;
    }

    public List<String> getApplicableDays() {
        return applicableDays;
    }

    public void setApplicableDays(List<String> applicableDays) {
        this.applicableDays = applicableDays;
    }

    public void addApplicableDay(String day) {
        this.applicableDays.add(day);
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public boolean isClosedNewYears() {
        return closedNewYears;
    }

    public void setClosedNewYears(boolean closedNewYears) {
        this.closedNewYears = closedNewYears;
    }

    public boolean isClosedPresidentsDay() {
        return closedPresidentsDay;
    }

    public void setClosedPresidentsDay(boolean closedPresidentsDay) {
        this.closedPresidentsDay = closedPresidentsDay;
    }

    public boolean isClosedMLKDay() {
        return closedMLKDay;
    }

    public void setClosedMLKDay(boolean closedMLKDay) {
        this.closedMLKDay = closedMLKDay;
    }

    public boolean isClosedGoodFriday() {
        return closedGoodFriday;
    }

    public void setClosedGoodFriday(boolean closedGoodFriday) {
        this.closedGoodFriday = closedGoodFriday;
    }

    public boolean isClosedMemorialDay() {
        return closedMemorialDay;
    }

    public void setClosedMemorialDay(boolean closedMemorialDay) {
        this.closedMemorialDay = closedMemorialDay;
    }

    public boolean isClosedIndependenceDay() {
        return closedIndependenceDay;
    }

    public void setClosedIndependenceDay(boolean closedIndependenceDay) {
        this.closedIndependenceDay = closedIndependenceDay;
    }

    public boolean isClosedLaborDay() {
        return closedLaborDay;
    }

    public void setClosedLaborDay(boolean closedLaborDay) {
        this.closedLaborDay = closedLaborDay;
    }

    public boolean isClosedColumbusDay() {
        return closedColumbusDay;
    }

    public void setClosedColumbusDay(boolean closedColumbusDay) {
        this.closedColumbusDay = closedColumbusDay;
    }

    public boolean isClosedThanksGiving() {
        return closedThanksGiving;
    }

    public void setClosedThanksGiving(boolean closedThanksGiving) {
        this.closedThanksGiving = closedThanksGiving;
    }

    public boolean isClosedThanksGivingAfter() {
        return closedThanksGivingAfter;
    }

    public void setClosedThanksGivingAfter(boolean closedThanksGivingAfter) {
        this.closedThanksGivingAfter = closedThanksGivingAfter;
    }

    public boolean isClosedChristmasDay() {
        return closedChristmasDay;
    }

    public void setClosedChristmasDay(boolean closedChristmasDay) {
        this.closedChristmasDay = closedChristmasDay;
    }

    public boolean isClosedChristmasEve() {
        return closedChristmasEve;
    }

    public void setClosedChristmasEve(boolean closedChristmasEve) {
        this.closedChristmasEve = closedChristmasEve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isClosedVeteransDay() {
        return closedVeteransDay;
    }

    public void setClosedVeteransDay(boolean closedVeteransDay) {
        this.closedVeteransDay = closedVeteransDay;
    }

    public boolean isClosedRemembranceDay() {
        return closedRemembranceDay;
    }

    public void setClosedRemembranceDay(boolean closedRemembranceDay) {
        this.closedRemembranceDay = closedRemembranceDay;
    }

    public void setApplicableDays(String days) {
        this.applicableDays = StringUtility.stringToList(days);
    }
}
