package com.greenfoxacademy.chatapp.model;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
     User userName;
    String text;
    Long timestamp;


    public Message() {
    }

    public Message(Long id, User userName, String text, Long timestamp) {
        this.id = generateRandomId();
        this.userName = userName;
        this.text = text;
        this.timestamp = timestamp;
    }

    public Long getId() {
        id = generateRandomId();
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long generateRandomId(){
        long max = 9999999;
        long min = 1000000;
        long range = (max - min) + 1;
        long randomId=(long) (Math.random()*range)+min;
        return randomId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public void giveUserNameToMasseage(User user){
            this.user = userName;
            user.(this);
        }
    }
}
