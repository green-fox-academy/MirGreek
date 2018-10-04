package com.greenfoxacademy.shelterapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shelter {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    public Shelter(String name) {
        this.name = name;
    }

    public Shelter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
