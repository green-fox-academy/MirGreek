package com.greenfoxacademy.bankofsymba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnjoyController {
  @RequestMapping (value = "/enjoy")
  public String enjoyString(Model model){
    model.addAttribute("text","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }
}
