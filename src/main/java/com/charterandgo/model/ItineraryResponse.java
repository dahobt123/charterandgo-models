package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItineraryResponse {

    private List<Segment> segments = new ArrayList<>();
    private String error;
    private int seats;
    private BigDecimal cargo;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public Segment getSegment(String type) {
        for (Segment segment: segments) {
            if (segment.getActionCode().equals(type)) {
                return segment;
            }
        }
        return null;
    }

    public void addSegment(Segment seg) {
        this.segments.add(seg);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public BigDecimal getCargo() {
        return cargo;
    }

    public void setCargo(BigDecimal cargo) {
        this.cargo = cargo;
    }
}