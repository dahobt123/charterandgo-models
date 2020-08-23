package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StateInfo {

    private String stateCode;
    private String stateName;
    private BigDecimal stateSalesTax;
    private List<String> adjacentStates = new ArrayList<>();
    private int circleRange;

    public StateInfo() {

    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public BigDecimal getStateSalesTax() {
        return stateSalesTax;
    }

    public void setStateSalesTax(BigDecimal stateSalesTax) {
        this.stateSalesTax = stateSalesTax;
    }

    public List<String> getAdjacentStates() {
        return adjacentStates;
    }

    public void setAdjacentStates(List<String> adjacentStates) {
        this.adjacentStates = adjacentStates;
    }

    public void addAdjacentState(String adjacentState) {
        adjacentStates.add(adjacentState);
    }

    public int getCircleRange() {
        return circleRange;
    }

    public void setCircleRange(int circleRange) {
        this.circleRange = circleRange;
    }
}
