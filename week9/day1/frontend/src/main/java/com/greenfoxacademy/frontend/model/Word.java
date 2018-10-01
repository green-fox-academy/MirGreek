package com.greenfoxacademy.frontend.model;

public class Word {
    String appended;

    public Word(String appended) {
        this.appended = appended;
    }

    public String getWord() {
        return appended;
    }

    public void setWord(String appended) {
        this.appended = appended;
    }
}
