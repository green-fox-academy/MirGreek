package com.greenfoxacademy.shelterapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    List<Animal> animals;

    public Shelter(String name) {
        this.name = name;
    }

    public Shelter() {
        this(null);
    }

    public Shelter(String name, List<Animal> animals) {
        this.name = name;
        this.animals = new ArrayList<>();
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

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public void addAnimalToList(Animal animal){
        this.animals.add(animal);
    }
}
