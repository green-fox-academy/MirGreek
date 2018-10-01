package com.greenfoxacademy.frontend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    String name;
    String title;
    @JsonProperty("welcome_message")
    String welcomeMessage;


    public Person() {
    }



    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Person(String name, String title, String welcomeMessage) {
        this.name = name;
        this.title = title;
        this.welcomeMessage = welcomeMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}


