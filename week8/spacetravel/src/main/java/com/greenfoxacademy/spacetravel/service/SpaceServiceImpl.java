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

        changePopulation(ship,planet);
        /*if (peopleOnShip< max) {
            ship.setUtilization((int) (planetPopulation + peopleOnShip));
            planet.setPopulation(planetPopulation - peopleOnShip);
        } else if(peopleOnShip==max){
            planet.setPopulation(planetPopulation);
            ship.setUtilization(max);
        }
        if(planetPopulation<=peopleOnShip) {
            planet.setPopulation(0);
            ship.setUtilization((int)planetPopulation);
        }
        if(planetPopulation>=peopleOnShip){
            ship.setUtilization(max);
            planet.setPopulation(planetPopulation-(max-peopleOnShip));
            if (peopleOnShip==max){
                ship.setUtilization(max);
                planet.setPopulation(planetPopulation);
            } else
                planet.setPopulation(planetPopulation-peopleOnShip);
        } else if (planetPopulation<=max){
            planet.setPopulation(0);
        }*/

        planetRepository.save(planet);
        spaceShipRepository.save(ship);
    }

    @Override
    public void moveToPlanet(Long id) {
        Spaceship ship = spaceShipRepository.findAllById(1L);
        Planet planet =planetRepository.findAllById(id);

        int max = ship.getMaxCapacity();
        int peopleOnShip=ship.getUtilization();
        long planetPopulation =  planet.getPopulation();

        if(peopleOnShip<planetPopulation) {
            planet.setPopulation(planetPopulation + peopleOnShip);
            ship.setUtilization(0);
        }else  planet.setPopulation(peopleOnShip+planetPopulation);
        ship.setUtilization(0);
        planetRepository.save(planet);
        spaceShipRepository.save(ship);
    }

    void changePopulation(Spaceship ship, Planet planet) {
        int max = ship.getMaxCapacity();
        int newShipUtil = 0;
        long newPlanetPop = 0;
        if (ship.getUtilization() < max && planet.getPopulation() <= ship.getUtilization()) {
            newShipUtil = (int) planet.getPopulation();
            ship.setUtilization(newShipUtil);
            planet.setPopulation(planet.getPopulation() - newShipUtil);
        } else if (ship.getUtilization() < max && planet.getPopulation() >= max){
                ship.setUtilization(max);
                planet.setPopulation(planet.getPopulation() - max);
        } else if (ship.getUtilization() < max && planet.getPopulation() <= max){
                ship.setUtilization((int)planet.getPopulation());
                planet.setPopulation(0);
        } else if (ship.getUtilization() == max) {
            ship.setUtilization(max);
            planet.setPopulation(planet.getPopulation());
        } else if (planet.getPopulation() <= max && ship.getUtilization() < max) {
            planet.setPopulation(0);
            ship.setUtilization((int) planet.getPopulation());
        } else if (ship.getUtilization()==0){
            ship.setUtilization(max);
            planet.setPopulation(planet.getPopulation()-max);
        }

    }
}