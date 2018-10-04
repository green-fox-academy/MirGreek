package com.greenfoxacademy.shelterapp.controller;
import com.greenfoxacademy.shelterapp.model.Animal;
import com.greenfoxacademy.shelterapp.model.Person;
import com.greenfoxacademy.shelterapp.model.Shelter;
import com.greenfoxacademy.shelterapp.repository.AnimalRepository;
import com.greenfoxacademy.shelterapp.repository.PersonRepository;
import com.greenfoxacademy.shelterapp.repository.ShelterRepository;
import com.greenfoxacademy.shelterapp.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShelterController {


    ShelterService shelterService;
    ShelterRepository shelterRepository;
    AnimalRepository animalRepository;
    PersonRepository personRepository;

    @Autowired
    public ShelterController(ShelterService shelterService, ShelterRepository shelterRepository, AnimalRepository animalRepository, PersonRepository personRepository) {
        this.shelterService = shelterService;
        this.shelterRepository = shelterRepository;
        this.animalRepository = animalRepository;
        this.personRepository = personRepository;
    }










    @GetMapping("/shelters")
    public String getSheltersPage(Model model){
        List<Shelter> shelters= shelterRepository.findAll();
        model.addAttribute("shelters",shelters);
        return "shelters";
    }
    @PostMapping("/addNew")
    public String addNewShelter(Model model, @ModelAttribute(value="add")String name){
        Shelter shelter = shelterService.createShelter(name);
        model.addAttribute("shelters",shelter);
        return "redirect:/shelters";
    }
    @GetMapping("/profile/{id}")
    public String getsheltersPageById(@PathVariable(value = "id")Long id, Model model){
        Shelter shelter =  shelterService.getShelterById(id);
        model.addAttribute("shelter",shelter);
        model.addAttribute("newanimal",new Animal());
        return "shelterpage";
    }
    @PostMapping("profile/{id}")
    public String addNewAnimalToShelter(@ModelAttribute Animal animal,
                                       @PathVariable(value="id")Long shelterId){
        shelterService.addAnimalToShelter(shelterId,animal);
        return "redirect:/profile/"+ shelterId;
    }
    @GetMapping("profile/{id}/adopt")
    public String adoptAnimal(@PathVariable(value="id")Long shelterId, Model model,
                              @ModelAttribute(value="animalId")Long animalId,
                              @ModelAttribute Person person){
        //shelterService.adoptAnimal(animalId,person);
        model.addAttribute("animal",animalRepository.findById(animalId));
        model.addAttribute("person",shelterService.adoptAnimal(animalId,shelterId,person));
        return "person";
    }






}
