package com.greenfoxacademy.spacetravel.service;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

     List<Planet> getPlanets();

     Spaceship getSpaceship(long id);

     void moveHere(long id);

}
