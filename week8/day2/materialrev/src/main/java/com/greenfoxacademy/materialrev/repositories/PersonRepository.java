package com.greenfoxacademy.materialrev.repositories;

import com.greenfoxacademy.materialrev.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
