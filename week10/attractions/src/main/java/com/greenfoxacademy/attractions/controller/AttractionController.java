package com.greenfoxacademy.attractions.controller;

import com.greenfoxacademy.attractions.model.Attraction;
import com.greenfoxacademy.attractions.repository.AttractionsRepository;
import com.greenfoxacademy.attractions.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionController {

  AttractionsRepository attractionsRepository;
  AttractionService attractionService;

  @Autowired
  public AttractionController(AttractionsRepository attractionsRepository, AttractionService attractionService) {
    this.attractionsRepository = attractionsRepository;
    this.attractionService = attractionService;
  }

  @GetMapping("/")
  public String getMainPage(Model model){
    model.addAttribute("attractions",attractionService.findAttractionList());
    model.addAttribute("attraction",new Attraction());
    return "index";
  }

  @PostMapping("/add")
  public String addNewItem(Attraction attraction){
   attractionsRepository.save(attraction);
   return "redirect:/";
  }
  @GetMapping("/edit/{id}")
  public String editItem(@PathVariable(value="id")Integer id, Model model){
    model.addAttribute("attraction",attractionService.findAttractionById(id));

    return "index";
  }





}

