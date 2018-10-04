package com.greenfoxacademy.shelterapp.service;

import com.greenfoxacademy.shelterapp.model.Animal;
import com.greenfoxacademy.shelterapp.model.Shelter;
/*import com.greenfoxacademy.shelterapp.repository.AnimalRepository;
import com.greenfoxacademy.shelterapp.repository.PersonRepository;
import com.greenfoxacademy.shelterapp.repository.ShelterRepository;*/
import com.greenfoxacademy.shelterapp.repository.AnimalRepository;
import com.greenfoxacademy.shelterapp.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelterServiceImpl implements ShelterService {
    ShelterRepository shelterRepository;
    AnimalRepository animalRepository;

    @Autowired
    public ShelterServiceImpl(ShelterRepository shelterRepository, AnimalRepository animalRepository) {
        this.shelterRepository = shelterRepository;
        this.animalRepository = animalRepository;
    }




    @Override
    public Shelter createShelter(String name) {
        Shelter shelter = new Shelter(name);
        shelterRepository.save(shelter);
        shelterRepository.findAll();
        return shelter;
    }

    @Override
    public Shelter getShelterById(Long id) {
        Shelter shelter =  shelterRepository.findById(id).get();
        return shelter ;
    }

    @Override
    public Animal addAnimalToShelter(Long shelterId, Animal animal) {
        Shelter shelter = shelterRepository.findById(shelterId).get();
        shelter.addAnimalToList(animal);
        shelterRepository.save(shelter);
        return null;
    }

    /*@Override
    public Animal addNewAnimal(String name,String color, int age ) {
        Animal animal = new Animal(name,color,age);
        animalRepository.save(animal);
        animalRepository.findAll();
        return animal;
    }*/
}
