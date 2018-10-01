package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.NumberInput;
import org.springframework.stereotype.Service;

@Service
public class NumberService {


    public NumberInput addNumber(int recieved){
        NumberInput number = new NumberInput(recieved,recieved*2);
       return number;
    }


    public NumberService() {
    }
}
