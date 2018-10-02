package com.greenfoxacademy.groot.services;

import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.GrootError;
import org.springframework.stereotype.Service;

@Service
public interface GuardianService {

    public Groot MessageOfGroot(String message);
    public GrootError ErrorOfGroot();
}
