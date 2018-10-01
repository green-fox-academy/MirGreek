package com.greenfoxacademy.frontend.model;

public class ErrorModel {
    String error;

    public ErrorModel(String error) {
        this.error = "Please provide an input!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = "Please provide an input!";
    }
}
