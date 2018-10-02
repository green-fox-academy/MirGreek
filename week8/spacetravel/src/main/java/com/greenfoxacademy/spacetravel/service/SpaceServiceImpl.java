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
    public Spaceship getSpaceship(Long id) {
        return spaceShipRepository.findAllById(id);
    }

    @Override
    public void moveHere(Long planetId) {
     String planetName=planetRepository.findAllById(planetId).getName(); //Moon, id:1
        Spaceship ship = spaceShipRepository.findAllById(1L);
                ship.setPlanet(planetName);
                spaceShipRepository.save(ship);
    }

    @Override
    public void moveToShip(Spaceship ship, Planet planet) {
        int maxPeopleOnShip = 60;
        int actualPeopleOnShip=ship.getUtilization();
        long planetPopulation =  planet.getPopulation();
        if (actualPeopleOnShip< maxPeopleOnShip){
            ship.setUtilization(actualPeopleOnShip); //60
            planet.setPopulation(planet.getPopulation()-actualPeopleOnShip);
        }
        if(planetPopulation<actualPeopleOnShip){
            ship.setUtilization((int)planetPopulation);
            planet.setPopulation(0);
        }
        if(planetPopulation<maxPeopleOnShip)
            ship.setUtilization((int)planetPopulation);
        planet.setPopulation(0);
        planetRepository.save(planet);
        spaceShipRepository.save(ship);
    }

    @Override
    public void moveToPlanet() {

    }


}
