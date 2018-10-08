package com.greenfoxacademy.attractions.controller;

import com.greenfoxacademy.attractions.model.Attraction;
import com.greenfoxacademy.attractions.model.Attractions;
import com.greenfoxacademy.attractions.repository.AttractionsRepository;
import com.greenfoxacademy.attractions.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttractionsRestController {

  AttractionsRepository attractionsRepository;
  AttractionService attractionService;

  @Autowired
  public AttractionsRestController(AttractionsRepository attractionsRepository, AttractionService attractionService) {
    this.attractionsRepository = attractionsRepository;
    this.attractionService = attractionService;
  }




  @GetMapping("/budge")
  public Object getBudge(){
    String category = "";
    Attractions attractionsList = new Attractions();
    category ="restaurant";
    Attraction restaurant  = attractionService.getFirstPrice(category);
    category ="museum";
    Attraction museum  = attractionService.getFirstPrice(category);
    category ="park";
    Attraction park  = attractionService.getFirstPrice(category);
    attractionsList.addAttractionToList(restaurant);
    attractionsList.addAttractionToList(museum);
    attractionsList.addAttractionToList(park);
    return attractionsList;
  }
}
