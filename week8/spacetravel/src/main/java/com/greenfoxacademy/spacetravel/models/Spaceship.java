package com.greenfoxacademy.spacetravel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int maxCapacity;
    int utilization;
    String planet;
    boolean isActive;

    public Spaceship(int maxCapacity, int utilization, String planet, boolean isActive) {
        this.maxCapacity = maxCapacity;
        this.utilization = utilization;
        this.planet = planet;
        this.isActive = false;
    }

    public Spaceship() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getUtilization() {
        return utilization;
    }

    public void setUtilization(int utilization) {
        this.utilization = utilization;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = false;
    }
}

