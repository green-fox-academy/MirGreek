package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.Word;
import org.springframework.stereotype.Service;

@Service
public class ServiceFrontend {

    public Word appendWord(String string){
        Word word = new Word(string );
        word.setWord(string+ "a");
        return word;
    }
}
