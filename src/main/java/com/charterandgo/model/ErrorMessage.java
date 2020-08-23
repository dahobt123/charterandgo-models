package com.charterandgo.model;

public class ErrorMessage {

    private String message;
    private String language;

    public ErrorMessage(String message, String language) {
        this.message = message;
        this.language = language;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
