package com.greenfoxacademy.hollobeanworld.controller;

import com.greenfoxacademy.hollobeanworld.services.MyColor;
import com.greenfoxacademy.hollobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ColorController {
  @Autowired
UtilityService utilservice;

  @GetMapping ("/useful/colored")
  public String backgroundColored(Model model,UtilityService utilservice){
    this.utilservice = utilservice;
    model.addAttribute("mycolor",utilservice);
    return "color";
  }

  @GetMapping ("/random")
  public String random(Model model){
    model.addAttribute("color",utilservice.getRandom());
    return "randomhtml";
  }



  @GetMapping ("/useful")
  public String background(){
    return "useful";
  }
}
