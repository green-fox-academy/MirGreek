package com.greenfoxacademy.frontend.model;



public class NumberInput {

    int received;
    int result;


    public NumberInput(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public NumberInput() {
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}