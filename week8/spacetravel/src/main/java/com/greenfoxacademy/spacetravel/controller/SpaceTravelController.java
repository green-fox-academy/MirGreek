package com.greenfoxacademy.spacetravel.controller;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.repository.PlanetRepository;
import com.greenfoxacademy.spacetravel.repository.SpaceShipRepository;
import com.greenfoxacademy.spacetravel.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpaceTravelController {

    PlanetRepository planetRepository;
    SpaceShipRepository spaceShipRepository;
    SpaceService spaceService;


    @Autowired
    public SpaceTravelController(PlanetRepository planetRepository, SpaceShipRepository spaceShipRepository,SpaceService spaceService) {
        this.planetRepository = planetRepository;
        this.spaceShipRepository = spaceShipRepository;
        this.spaceService = spaceService;
    }

    @GetMapping("/")
    public String getMain(Model model){
       model.addAttribute("planetlist",spaceService.getPlanets());
        model.addAttribute("spaceship",spaceService.getSpaceship(1L));
        return "index";
    }

    @PostMapping ("/movehere/{id}")
     public String moveHere(@PathVariable(value = "id")long id){
        spaceService.moveHere(id);
        return "redirect:/";
    }
    @GetMapping ("/toship/{id}")
    public String toShip(@PathVariable(value="id")long planetId, Planet planet,Spaceship ship){
        spaceService.moveToShip(ship,planet);
        return "redirect:/";
    }

    @GetMapping ("/toplanet/{id}")
    public String toPlanet(@PathVariable(value="id")long id, Planet planet,Spaceship ship){
       String planetName= ship.getPlanet();
        if (planetName.equals(planet.getName())){
            planet.setPopulation(((long) ship.getUtilization()));
            ship.setUtilization(0);
        }
        planetRepository.save(planet);
        spaceShipRepository.save(ship);
        return "redirect:/";
    }
}
