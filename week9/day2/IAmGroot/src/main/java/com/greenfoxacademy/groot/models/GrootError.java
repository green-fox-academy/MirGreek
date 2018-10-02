package com.greenfoxacademy.groot.models;

public class GrootError {
    String error;

    public GrootError(String error) {
        this.error = error;
    }

    public GrootError() {
    }

    public String getError() {
        return "I am Groot";
    }

    public void setError(String error) {
        this.error = error;
    }
}
