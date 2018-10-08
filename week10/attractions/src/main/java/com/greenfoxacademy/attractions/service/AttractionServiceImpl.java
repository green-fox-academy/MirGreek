package com.greenfoxacademy.attractions.service;

import com.greenfoxacademy.attractions.model.Attractions;
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

  public List<Attractions> findAttractionList(){
    return attractionsRepository.findAll();
  }
}
