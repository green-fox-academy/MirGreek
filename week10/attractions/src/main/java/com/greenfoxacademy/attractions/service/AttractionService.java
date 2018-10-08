package com.greenfoxacademy.attractions.service;

import com.greenfoxacademy.attractions.model.Attraction;
import com.greenfoxacademy.attractions.model.Attractions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {
  public List<Attraction> findAttractionList();
  public Attraction findAttractionById(Integer Id);
  public Attraction getFirstPrice(String category);
}
