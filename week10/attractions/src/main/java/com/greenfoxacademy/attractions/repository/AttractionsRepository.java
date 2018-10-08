package com.greenfoxacademy.attractions.repository;

import com.greenfoxacademy.attractions.model.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionsRepository  extends CrudRepository<Attraction,Integer> {
  List<Attraction> findAll();
  Attraction findFirstByCategoryOrderByPriceAsc(String category);



}
