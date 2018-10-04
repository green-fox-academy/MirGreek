package com.greenfoxacademy.shelterapp.service;

import com.greenfoxacademy.shelterapp.model.Animal;
import com.greenfoxacademy.shelterapp.model.Shelter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface ShelterService {
    Shelter createShelter(String name);
    Shelter getShelterById(Long id);
    //Animal addNewAnimal(String name, String color, int age);
    Animal addAnimalToShelter(Long shelterId, Animal animal);
}
