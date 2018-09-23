package com.greenfoxacademy.fox.controller;

import com.greenfoxacademy.fox.model.Fox;
import com.greenfoxacademy.fox.service.Foxservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FoxController {
    @Autowired
    Foxservice foxService;
    List<Fox> foxes;
    List<String> foods;
    List<String> drinks;

    public FoxController() {
    }

    @RequestMapping(value="/nutritionstore")
    public String nutritionStore(@RequestParam("name")String name, Model model){
        Fox fox = new Fox(name);
        model.addAttribute(fox);
        model.addAttribute(foods);
        model.addAttribute(drinks);
        return "nutritionstore";
    }
}


