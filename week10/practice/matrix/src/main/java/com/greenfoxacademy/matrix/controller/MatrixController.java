package com.greenfoxacademy.matrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixController {

  @GetMapping("/")
  public String getMainPage(){
    return "index";
  }
  @PostMapping("/matrix")
    public String getMatrix(){

    }
  }

