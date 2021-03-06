package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.services.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    GuardianService guardianService;

    @Autowired
    public GuardianController(GuardianService guardianService) {
        this.guardianService = guardianService;
    }

    @GetMapping("/groot")
    public ResponseEntity<?> getGroot(@RequestParam(value="message", required = false)String message){
            if(message==null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST) //400
                        .body(guardianService.ErrorOfGroot());
            } else
            return ResponseEntity.ok().body(guardianService.MessageOfGroot(message));
    }
}
