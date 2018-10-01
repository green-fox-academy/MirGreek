package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.Word;
import org.springframework.stereotype.Service;

@Service
public class ServiceFrontend {

    public Word appendWord(String string){
        Word appended = new Word(string );
        appended.setAppended(string+ "a");
        return appended;
    }
}
