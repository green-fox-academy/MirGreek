package com.greenfoxacademy.trybuiltinauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

  @GetMapping("/")
  public String getLoginPage(){
    return "Login";
  }

  @RequestMapping("/stories")
  public String stories(){
    return "stories";
  }

  @RequestMapping("/delete")
  public String delete(){
    return "delete";
  }
}
