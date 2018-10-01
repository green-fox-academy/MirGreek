package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Person getWelcomeMessage(String name, String title){
        Person person = new Person(name,title);
        person.setWelcomeMessage( "Oh, hi there" + name + ",  my dear" + title + "!");
        return person;
    }
}
