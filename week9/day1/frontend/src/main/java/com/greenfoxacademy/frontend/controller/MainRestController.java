package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ErrorModel;
import com.greenfoxacademy.frontend.model.NumberInput;
import com.greenfoxacademy.frontend.model.Person;
import com.greenfoxacademy.frontend.service.NumberService;
import com.greenfoxacademy.frontend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    NumberService numberService;
    PersonService personService;

    @Autowired
    public MainRestController(NumberService numberService, PersonService personService) {
        this.numberService = numberService;
        this.personService = personService;
    }

    @GetMapping("/doubling")
    public Object queryInput(@RequestParam(value = "input", required = false) Integer input, ErrorModel error) {
        if (input != null) {
            NumberInput result = numberService.addNumber(input);
            return result;
        } else {
            error.setError("Please provide an input!");
            return error;
        }
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name") String name,
                          @RequestParam(value = "title") String title,
                          ErrorModel error) {
        if (name != "" && title != "") {
            Person person = personService.getWelcomeMessage(name, title);
            return person;
        } else if (name.equals("")) {
            error.setError("Please provide a name!");
            return error;
        } else {
            error.setError("Provide a title, buddy!");
        } return error;
    }
}


