package com.greenfoxacademy.chatapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class User {

    Random random = new Random( 1000000 - 9999999);
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    Long id;
    String userName;
    String text;
    Long timestamp;

    public User(Random random, Long id, String userName, String text, Long timestamp) {
        this.random = random;
        this.id = id;
        this.userName = userName;
        this.text = text;
        this.timestamp = timestamp;
    }

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
