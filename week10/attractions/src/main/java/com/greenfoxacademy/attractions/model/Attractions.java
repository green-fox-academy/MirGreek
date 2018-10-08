package com.greenfoxacademy.attractions.model;

import java.util.ArrayList;
import java.util.List;

public class Attractions {
  List<Attraction> attractions;

  public Attractions(List<Attraction> attractions) {
    this.attractions = new ArrayList<>();
  }

  public Attractions() {
    this.attractions = new ArrayList<>();


}

  public List<Attraction> getAttractions() {
    return attractions;
  }

  public void setAttractions(List<Attraction> attractions) {
    this.attractions = attractions;
  }
  public  void addAttractionToList(Attraction attraction){
    this.getAttractions().add(attraction);

  }
}
