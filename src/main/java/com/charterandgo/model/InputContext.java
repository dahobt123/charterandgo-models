package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class InputContext implements Serializable {

    private String domainName;
    private String language;
    private String transactionid;
    private String securityToken;

    public InputContext() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("domainName", domainName);
        obj.put("language", language);
        obj.put("transactionid", transactionid);
        obj.put("securityToken", securityToken);
        return obj;

    }

    public String toString() {
        System.out.println("In InputContext.toString");
        return domainName + "-" + language + "-" + transactionid + "-" + securityToken + "\n";
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }
}
