package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class ShopData {
    private int errorCode;
    private String language;
    private String domain;
    private String errorType;
    private String errorMessage;
    private List<List<PaxRequest>> paxRequests = new ArrayList<>();

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<List<PaxRequest>> getPaxRequests() {
        return paxRequests;
    }

    public void setPaxRequests(List<List<PaxRequest>> paxRequests) {
        this.paxRequests = paxRequests;
    }

    public void addPaxRequest(List<PaxRequest> req) {
        this.paxRequests.add(req);
    }
}
