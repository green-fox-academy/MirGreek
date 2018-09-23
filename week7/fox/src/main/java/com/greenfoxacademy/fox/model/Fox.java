package com.greenfoxacademy.fox.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Fox {
    String name;
    String food;
    String drink;
    int numTricks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getNumTricks() {
        return numTricks;
    }

    public void setNumTricks(int numTricks) {
        this.numTricks = numTricks;
    }



    public Fox(String name) {
        this.name=name;
    }



    public Fox(String name, String food, int numTricks) {
        this.name = name;
        this.food = "pizza";
        this.drink = "water";
        this.numTricks = numTricks;
    }

}
