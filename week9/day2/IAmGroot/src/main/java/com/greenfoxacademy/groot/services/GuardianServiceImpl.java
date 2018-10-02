package com.greenfoxacademy.groot.services;

import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.GrootError;
import org.springframework.stereotype.Service;

@Service
public class GuardianServiceImpl implements GuardianService {

    @Override
    public Groot MessageOfGroot(String message) {
        Groot groot = new Groot(message);
        return groot;
    }

    @Override
    public GrootError ErrorOfGroot() {
        GrootError error = new GrootError();
        error.setError("I am Groot!");
        return error;
    }
}
