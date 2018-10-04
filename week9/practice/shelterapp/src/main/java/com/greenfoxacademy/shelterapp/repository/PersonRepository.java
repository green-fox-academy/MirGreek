package com.greenfoxacademy.shelterapp.repository;

import com.greenfoxacademy.shelterapp.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
