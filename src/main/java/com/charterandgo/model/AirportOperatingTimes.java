package com.charterandgo.model;



import com.charterandgo.charterhelpers.DateHelper;

import java.util.*;

public class AirportOperatingTimes {

    public static final Date INDEX_DATE = DateHelper.parseIsoDate("2020-07-01");
    private String locId;
    private boolean excludeHolidays;
    private String fuelAvailable;
    //          site        month   7 days
    private Map<Integer, Map<Integer, OperatingTimesDay>> operationTimesByDay = new HashMap<>();
    public static final List<String> MONTHS = Arrays.asList("JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC");
    public static final List<String> DAYS = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");  //  M


   public AirportOperatingTimes() {

   }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }



    public Map<Integer, Map<Integer, OperatingTimesDay>> getOperationTimesByDay() {
        return operationTimesByDay;
    }

    public void setOperationTimesByDay(Map<Integer, Map<Integer, OperatingTimesDay>> operationTimesByDay) {
        this.operationTimesByDay = operationTimesByDay;
    }

    public void addOperationsTime(String season, String day, OperatingTimesDay op) {


    }

    public String isFuelAvailable() {
        return fuelAvailable;
    }

    public void setFuelAvailable(String fuelAvailable) {
        this.fuelAvailable = fuelAvailable;
    }



    public boolean isExcludeHolidays() {
        return excludeHolidays;
    }

    public void setExcludeHolidays(boolean excludeHolidays) {
        this.excludeHolidays = excludeHolidays;
    }
}
