package com.greenfoxacademy.trybuiltinauthentication.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

  @GetMapping("/")
  public String getLoginPage(){
    return "Login";
  }
  //@Secured("ROLE_USER")
  @RequestMapping("/stories")
  public String stories(){
    return "stories";
  }
  //@Secured("ROLE_ADMIN")
  @RequestMapping("/delete")
  public String delete(){
    return "delete";
  }
}
