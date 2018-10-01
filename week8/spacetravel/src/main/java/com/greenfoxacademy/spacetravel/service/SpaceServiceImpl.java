package com.greenfoxacademy.spacetravel.service;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.repository.PlanetRepository;
import com.greenfoxacademy.spacetravel.repository.SpaceShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpaceServiceImpl implements SpaceService {

    SpaceShipRepository spaceShipRepository;
    PlanetRepository planetRepository;


    @Autowired
    public SpaceServiceImpl(SpaceShipRepository spaceShipRepository, PlanetRepository planetRepository) {
        this.spaceShipRepository = spaceShipRepository;
        this.planetRepository = planetRepository;
    }

    public SpaceServiceImpl() {
    }

    @Override
    public List<Planet> getPlanets() {
        return planetRepository.findAll();
    }

    @Override
    public Spaceship getSpaceship(long id) {
        return spaceShipRepository.findById(id).get();
    }

    @Override
    public void moveHere(long id, String planet) {
        getSpaceship(id).setPlanet(planet);
    }

}
