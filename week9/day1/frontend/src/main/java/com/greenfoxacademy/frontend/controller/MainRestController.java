package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import com.greenfoxacademy.frontend.service.ErrorService;
import com.greenfoxacademy.frontend.service.NumberService;
import com.greenfoxacademy.frontend.service.PersonService;
import com.greenfoxacademy.frontend.service.ServiceFrontend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    NumberService numberService;
    PersonService personService;
    ServiceFrontend serviceFrontend;
    ErrorService errorService;

    @Autowired
    public MainRestController(NumberService numberService, PersonService personService, ServiceFrontend serviceFrontend, ErrorService errorService) {
        this.numberService = numberService;
        this.personService = personService;
        this.serviceFrontend = serviceFrontend;
        this.errorService = errorService;
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
        }
        return error;
    }

    @GetMapping("/appenda/{appendable}")
    public Object appendA(@PathVariable(value = "appendable") String string) {
        Word appended = serviceFrontend.appendWord(string);
        return appended;
    }

    @PostMapping("dountil/{action}")
    public Object doUntil(@PathVariable(value = "action") String action,
                          @RequestBody DoUntil number, ErrorModel error) {
        if (number != null) {
            return serviceFrontend.sumOrFactorNumber(action, number);
        } else error.setError("Please provide a number!");
        return error;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(ErrorModel error,@RequestBody(required = false) ArrayModel numbers) {
        if (numbers.getWhat() != null) {
            serviceFrontend.sumMultiplyOrDouble( numbers);
            ResponseEntity.ok().body(numbers);
        } else errorService.createError("Please provide what to do with the numbers!");
        return  ResponseEntity.ok().body(error);
    }
}


