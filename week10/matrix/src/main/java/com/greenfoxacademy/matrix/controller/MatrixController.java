package com.greenfoxacademy.matrix.controller;

import com.greenfoxacademy.matrix.model.Matrix;
import com.greenfoxacademy.matrix.model.Message;
import com.greenfoxacademy.matrix.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatrixController {

  MatrixService matrixService;

  @Autowired
  public MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String getMainPage(Model model, Message message) {
    model.addAttribute("matrix", new Matrix());
    model.addAttribute("message",message);
    return "index";
  }

  @PostMapping("/matrix")
  public String getMatrix(Matrix matrix) {
    if( matrixService.checkIfMatrixIsSquared(matrix)){
      return "index";
    } else
    return "redirect:/false";

  }
}
