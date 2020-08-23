package com.charterandgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class ItineraryRequest {

    private String tailNumber;
    private String make;
    private String model;
    private String reposStart;
    private String reposEnd;
    private String reposStatus;
    private BigDecimal reposDistance;
    private RunwayInfo reposRunwayInfo;
    private AirportFacilitiesInfo reposFacilities;
    private int repoElapsedTime;
    private String paxStart;
    private String paxEnd;
    private Date paxDepartTimestamp;
    private BigDecimal paxOutDistance;
    private String paxOutStatus;
    private RunwayInfo paxOutRunwayInfo;
    private AirportFacilitiesInfo paxOutFacilities;
    private boolean roundTrip;
    private String paxReturnStart;
    private String paxReturnEnd;
    private Date paxReturnTimestamp;
    private int paxElapsedTime;
    private BigDecimal paxBackDistance;
    private RunwayInfo paxReturnRunwayInfo;
    private AirportFacilitiesInfo paxBackFacilities;
    private String paxBackRunwayInfo;
    private String paxBackStatus;
    private String returnStart;
    private String returnEnd;
    private int returnElapsedTime;
    private BigDecimal returnDistance;
    private RunwayInfo returnRunwayInfo;
    private AirportFacilitiesInfo returnFacilities;
    private String returnStatus;
    private int seats;
    private BigDecimal cargo;

    public ItineraryRequest() {

    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReposStart() {
        return reposStart;
    }

    public void setReposStart(String reposStart) {
        this.reposStart = reposStart;
    }

    public String getReposEnd() {
        return reposEnd;
    }

    public void setReposEnd(String reposEnd) {
        this.reposEnd = reposEnd;
    }

    public int getRepoElapsedTime() {
        return repoElapsedTime;
    }

    public void setRepoElapsedTime(int repoElapsedTime) {
        this.repoElapsedTime = repoElapsedTime;
    }

    public String getPaxStart() {
        return paxStart;
    }

    public void setPaxStart(String paxStart) {
        this.paxStart = paxStart;
    }

    public String getPaxEnd() {
        return paxEnd;
    }

    public void setPaxEnd(String paxEnd) {
        this.paxEnd = paxEnd;
    }

    public Date getPaxDepartTimestamp() {
        return paxDepartTimestamp;
    }

    public void setPaxDepartTimestamp(Date paxDepartTimestamp) {
        this.paxDepartTimestamp = paxDepartTimestamp;
    }

    public boolean isRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        this.roundTrip = roundTrip;
    }

    public Date getPaxReturnTimestamp() {
        return paxReturnTimestamp;
    }

    public void setPaxReturnTimestamp(Date paxReturnTimestamp) {
        this.paxReturnTimestamp = paxReturnTimestamp;
    }

    public int getPaxElapsedTime() {
        return paxElapsedTime;
    }

    public void setPaxElapsedTime(int paxElapsedTime) {
        this.paxElapsedTime = paxElapsedTime;
    }

    public String getReturnStart() {
        return returnStart;
    }

    public void setReturnStart(String returnStart) {
        this.returnStart = returnStart;
    }

    public String getReturnEnd() {
        return returnEnd;
    }

    public void setReturnEnd(String returnEnd) {
        this.returnEnd = returnEnd;
    }

    public int getReturnElapsedTime() {
        return returnElapsedTime;
    }

    public void setReturnElapsedTime(int returnElapsedTime) {
        this.returnElapsedTime = returnElapsedTime;
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

    public BigDecimal getReposDistance() {
        return reposDistance;
    }

    public void setReposDistance(BigDecimal reposDistance) {
        this.reposDistance = reposDistance;
    }

    public RunwayInfo getReposRunwayInfo() {
        return reposRunwayInfo;
    }

    public void setReposRunwayInfo(RunwayInfo reposRunwayInfo) {
        this.reposRunwayInfo = reposRunwayInfo;
    }

    public BigDecimal getPaxOutDistance() {
        return paxOutDistance;
    }

    public void setPaxOutDistance(BigDecimal paxOutDistance) {
        this.paxOutDistance = paxOutDistance;
    }

    public RunwayInfo getPaxOutRunwayInfo() {
        return paxOutRunwayInfo;
    }

    public void setPaxOutRunwayInfo(RunwayInfo paxOutRunwayInfo) {
        this.paxOutRunwayInfo = paxOutRunwayInfo;
    }

    public BigDecimal getPaxBackDistance() {
        return paxBackDistance;
    }

    public void setPaxBackDistance(BigDecimal paxBackDistance) {
        this.paxBackDistance = paxBackDistance;
    }

    public String getPaxBackRunwayInfo() {
        return paxBackRunwayInfo;
    }

    public void setPaxBackRunwayInfo(String paxBackRunwayInfo) {
        this.paxBackRunwayInfo = paxBackRunwayInfo;
    }

    public BigDecimal getReturnDistance() {
        return returnDistance;
    }

    public void setReturnDistance(BigDecimal returnDistance) {
        this.returnDistance = returnDistance;
    }

    public RunwayInfo getReturnRunwayInfo() {
        return returnRunwayInfo;
    }

    public void setReturnRunwayInfo(RunwayInfo returnRunwayInfo) {
        this.returnRunwayInfo = returnRunwayInfo;
    }

    public String getReposStatus() {
        return reposStatus;
    }

    public void setReposStatus(String reposStatus) {
        this.reposStatus = reposStatus;
    }

    public String getPaxOutStatus() {
        return paxOutStatus;
    }

    public void setPaxOutStatus(String paxOutStatus) {
        this.paxOutStatus = paxOutStatus;
    }

    public String getPaxBackStatus() {
        return paxBackStatus;
    }

    public void setPaxBackStatus(String paxBackStatus) {
        this.paxBackStatus = paxBackStatus;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getPaxReturnStart() {
        return paxReturnStart;
    }

    public void setPaxReturnStart(String paxReturnStart) {
        this.paxReturnStart = paxReturnStart;
    }

    public String getPaxReturnEnd() {
        return paxReturnEnd;
    }

    public void setPaxReturnEnd(String paxReturnEnd) {
        this.paxReturnEnd = paxReturnEnd;
    }

    public RunwayInfo getPaxReturnRunwayInfo() {
        return paxReturnRunwayInfo;
    }

    public void setPaxReturnRunwayInfo(RunwayInfo paxReturnRunwayInfo) {
        this.paxReturnRunwayInfo = paxReturnRunwayInfo;
    }

    public AirportFacilitiesInfo getReposFacilities() {
        return reposFacilities;
    }

    public void setReposFacilities(AirportFacilitiesInfo reposFacilities) {
        this.reposFacilities = reposFacilities;
    }

    public AirportFacilitiesInfo getPaxOutFacilities() {
        return paxOutFacilities;
    }

    public void setPaxOutFacilities(AirportFacilitiesInfo paxOutFacilities) {
        this.paxOutFacilities = paxOutFacilities;
    }

    public AirportFacilitiesInfo getPaxBackFacilities() {
        return paxBackFacilities;
    }

    public void setPaxBackFacilities(AirportFacilitiesInfo paxBackFacilities) {
        this.paxBackFacilities = paxBackFacilities;
    }

    public AirportFacilitiesInfo getReturnFacilities() {
        return returnFacilities;
    }

    public void setReturnFacilities(AirportFacilitiesInfo returnFacilities) {
        this.returnFacilities = returnFacilities;
    }
}
