package com.greenfoxacademy.spacetravel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpaceShip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    int maxCapacity;
    int utilisation;
    String planet;

    public SpaceShip(int maxCapacity, int utilisation, String planet) {
        this.maxCapacity = maxCapacity;
        this.utilisation = utilisation;
        this.planet = planet;
    }

    public SpaceShip() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getUtilisation() {
        return utilisation;
    }

    public void setUtilisation(int utilisation) {
        this.utilisation = utilisation;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
