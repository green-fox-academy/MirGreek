package com.greenfoxacademy.shelterapp.repository;


import com.greenfoxacademy.shelterapp.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal,Long> {
    List<Animal> findAll();
}
