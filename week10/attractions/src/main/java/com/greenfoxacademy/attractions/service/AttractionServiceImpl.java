package com.greenfoxacademy.attractions.service;

import com.greenfoxacademy.attractions.model.Attraction;
import com.greenfoxacademy.attractions.repository.AttractionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  AttractionsRepository attractionsRepository;

  @Autowired
  public AttractionServiceImpl(AttractionsRepository attractionsRepository) {
    this.attractionsRepository = attractionsRepository;
  }

  public List<Attraction> findAttractionList(){
    return attractionsRepository.findAll();
  }

  @Override
  public Attraction findAttractionById(Integer id) {
    Attraction attraction = attractionsRepository.findById(id).get();
    attractionsRepository.save(attraction);
    return null;
  }

  @Override
  public Attraction getFirstPrice(String category) {
    Attraction attraction = attractionsRepository.findFirstByCategoryOrderByPriceAsc(category);
    return attraction;
  }

}
