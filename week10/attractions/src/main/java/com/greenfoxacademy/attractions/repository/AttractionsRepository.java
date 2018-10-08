package com.greenfoxacademy.attractions.repository;

import com.greenfoxacademy.attractions.model.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionsRepository  extends CrudRepository<Attractions,Integer> {
  List<Attractions> findAll();
}
