package com.charterandgo.model;

import org.json.JSONObject;

import java.io.Serializable;

public class RichMedia implements Serializable {

    private String uri;
    private String mediatype;
    private String usage;

    public RichMedia() {

    }

    public String toString() {
        return uri + "-" + mediatype + "-" + usage;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("uri", uri);
        obj.put("mediatype", mediatype);
        obj.put("usage", usage);
        return obj;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMediatype() {
        return mediatype;
    }

    public void setMediatype(String mediatype) {
        this.mediatype = mediatype;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
