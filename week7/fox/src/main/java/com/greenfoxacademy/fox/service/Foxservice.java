package com.greenfoxacademy.fox.service;

import com.greenfoxacademy.fox.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Foxservice {

    List<String> drinks;
    List<Fox> foxes;
    List<String> foods;

    public Foxservice(List<String> foods, List<String> drinks) {
        foods = new ArrayList<>();
        drinks = new ArrayList<>();
    }


    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<String> drinks) {
        this.drinks = drinks;
    }



        @Autowired
        public Foxservice(List<Fox> foxes) {
            foxes = new ArrayList<>();
        }

        public Foxservice() {
        }

        public List<Fox> getFoxes() {
            return foxes;
        }

        public void setFoxes(List<Fox> foxList) {
            this.foxes = foxList;
        }

        public Fox createFox(String name){
            Fox fox = new Fox(name);
            addFox(fox);
            return fox;
        }
        public void addFox(Fox fox){
            foxes.add(fox);
        }

        public Fox getFoxByName(String name){
            for (Fox fox :foxes){
                if (fox.getName().equals(name)) {
                    return fox;
                }
            }
            return null;

        }

        public void foodList(){
            foods.add("Carrot");
            foods.add("Porkolt");
            foods.add("Chicken");
            foods.add("Salad");
        }
    public void drinkList(){
        drinks.add("Cocoa");
        drinks.add("Milk");
        drinks.add("Palinka");
        drinks.add("Tea");
        }

        public void setFood(Fox fox,String food){
        for (String oneFood:foods) {
            if(oneFood.equals(food)){
                fox.setFood(food);
            }
        }
    }
    public void setDrink(Fox fox,String drink){
        for (String oneFood:foods) {
            if(oneFood.equals(drink)){
                fox.setDrink(drink);
            }
        }
    }



    }


