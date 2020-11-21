package com.charterandgo.model;


public class HoursForDay {
    private String open;
    private String close;
    private boolean closedForDay;

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public boolean isClosedForDay() {
        return closedForDay;
    }

    public void setClosedForDay(boolean closedForDay) {
        this.closedForDay = closedForDay;
    }
}

