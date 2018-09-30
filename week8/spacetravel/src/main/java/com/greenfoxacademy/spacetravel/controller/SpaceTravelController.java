package com.greenfoxacademy.spacetravel.controller;

import com.greenfoxacademy.spacetravel.repository.PlanetRepository;
import com.greenfoxacademy.spacetravel.repository.SpaceShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaceTravelController {

    PlanetRepository planetRepository;
    SpaceShipRepository spaceShipRepository;

    @Autowired
    public SpaceTravelController(PlanetRepository planetRepository, SpaceShipRepository spaceShipRepository) {
        this.planetRepository = planetRepository;
        this.spaceShipRepository = spaceShipRepository;
    }

    @GetMapping("/")
    public String getMain(Model model){
        model.addAttribute("planetlist",planetRepository.findAll());
        model.addAttribute("spaceshiplist",spaceShipRepository.findAll());
        return "index";
    }
}
