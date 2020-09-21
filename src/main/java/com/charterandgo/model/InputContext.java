package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class InputContext implements Serializable {

    private String domainName;
    private String client;
    private String language;
    private String transactionid;
    private String securityToken;
    private String responsetype;
    private String domain;
    private String errormessage;
    private int count;
    private int returnCode;



    public InputContext() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("count", count);
        obj.put("domainName", domainName);
        obj.put("returncode",returnCode);
        obj.put("responsetype",responsetype);
        obj.put("language", language);
        obj.put("errormessage", errormessage);
        if (client != null) {
            obj.put("client", client);
        }
        obj.put("transactionid", transactionid);
        obj.put("securityToken", securityToken);
        return obj;

    }

    public String toString() {
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
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getResponsetype() {
        return responsetype;
    }

    public void setResponsetype(String responsetype) {
        this.responsetype = responsetype;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
}
