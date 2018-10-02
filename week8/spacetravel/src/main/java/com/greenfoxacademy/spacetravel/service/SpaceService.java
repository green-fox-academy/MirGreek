package com.greenfoxacademy.spacetravel.service;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

     List<Planet> getPlanets();

    public Spaceship getSpaceship(Long id);

      void moveHere(Long id);
    public void moveToShip(Spaceship ship, Planet planet);
    public void moveToPlanet();

}
