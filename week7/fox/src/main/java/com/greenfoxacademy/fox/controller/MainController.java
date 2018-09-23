package com.greenfoxacademy.fox.controller;

import com.greenfoxacademy.fox.model.Fox;
import com.greenfoxacademy.fox.service.Foxservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class MainController {

    private Foxservice foxes;

    @Autowired
    public MainController(Foxservice foxes) {
        this.foxes=foxes;
    }
    @RequestMapping(value="/")
    public String indexBegin(){
        return "login";
    }


    @PostMapping(value = "/login")
    public String postName(@RequestParam(value="name")String name, Model model){
        Fox fox = new Fox(name,"Kamo",0);
        model.addAttribute("fox",fox);
        return "index";
    }


    }

