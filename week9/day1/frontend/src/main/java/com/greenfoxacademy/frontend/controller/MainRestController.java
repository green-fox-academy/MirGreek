package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ErrorModel;
import com.greenfoxacademy.frontend.model.NumberInput;
import com.greenfoxacademy.frontend.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    NumberService numberService;

    @Autowired
    public MainRestController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("/doubling")
    public Object queryInput(@RequestParam(value="input", required = false) Integer input, ErrorModel error){
        if(input!=null) {
            NumberInput result = numberService.addNumber(input);
            return result;
        } else  return error;



    }
}
