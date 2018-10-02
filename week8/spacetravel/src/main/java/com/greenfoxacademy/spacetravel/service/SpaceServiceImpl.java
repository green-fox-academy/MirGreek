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
    public void moveToShip(Long id) {
        Spaceship ship = spaceShipRepository.findAllById(1L);
        Planet planet =planetRepository.findAllById(id);
        int max = ship.getMaxCapacity();

        int peopleOnShip=ship.getUtilization();
        long planetPopulation =  planet.getPopulation();
        if (peopleOnShip< max) {
            ship.setUtilization((int) (planetPopulation + peopleOnShip));
            planet.setPopulation(+(planetPopulation - peopleOnShip));
        }if(planetPopulation<peopleOnShip) {
            planet.setPopulation(0);
        }
        if(planetPopulation>max){
            ship.setUtilization(max);
            planet.setPopulation(planetPopulation-max);
            } else if (planetPopulation<max){
            planet.setPopulation(0);
        } //else if (peopleOnShip>=max){
            //peopleOnShip=60;
        //}

        planetRepository.save(planet);
        spaceShipRepository.save(ship);
    }

    @Override
    public void moveToPlanet() {

    }


}
