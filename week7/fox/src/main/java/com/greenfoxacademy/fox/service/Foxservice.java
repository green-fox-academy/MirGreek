package com.greenfoxacademy.fox.service;

import com.greenfoxacademy.fox.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Foxservice {


        List<Fox> foxes;

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
            foxes.add(fox);
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
    }


