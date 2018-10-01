package com.greenfoxacademy.spacetravel.service;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.SpaceShip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

     List<Planet> getPlanets();

     SpaceShip getSpaceShip(long id);



}
