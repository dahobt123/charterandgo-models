package com.charterandgo.model;

import java.util.*;

public class AircraftPositions {

    private Map<String, Map<Date, List<String>>> positionsByAirport = new HashMap<>();


    public Map<String, Map<Date, List<String>>> getPositionsByAirport() {
        return positionsByAirport;
    }

    public void setPositionsByAirport(Map<String, Map<Date, List<String>>> positionsByAirport) {
        this.positionsByAirport = positionsByAirport;
    }

    public List<String> getPositionsByAirportDate(String airportCode, Date date) {
        Map<Date, List<String>> aircraftByDate = positionsByAirport.get(airportCode);
        if (aircraftByDate == null) {
            return Collections.EMPTY_LIST;
        }
        return aircraftByDate.get(date);
    }

    public void updateScheduleForAircraft(Segment segment) {
        Map<Date, List<String>> aircraftByDate = positionsByAirport.get(segment.getOrigin());
        if (aircraftByDate == null) {
            aircraftByDate = new HashMap<>();
        }

    }
}
