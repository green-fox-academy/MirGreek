package com.greenfoxacademy.chatapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String status;
    String message;

    public Status(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status() {
    }

    public Status(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
