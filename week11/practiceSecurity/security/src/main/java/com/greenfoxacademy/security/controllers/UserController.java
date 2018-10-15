package com.greenfoxacademy.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/")
  public String sayHello(){
    return "Hello";
  }
}
