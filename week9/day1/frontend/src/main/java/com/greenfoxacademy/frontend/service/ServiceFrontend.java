package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.DoUntil;
import com.greenfoxacademy.frontend.model.Result;
import com.greenfoxacademy.frontend.model.Word;
import org.springframework.stereotype.Service;

@Service
public class ServiceFrontend {

    public Word appendWord(String string){
        Word appended = new Word(string );
        appended.setAppended(string+ "a");
        return appended;
    }

    public Result sumOrFactorNumber(String action, DoUntil number){
        Result result = new Result();
        int temp=0;
        if(action.equals("sum")) {
            for (int i = 0; i <=number.getUntil(); i++) {
               temp+=i;
            }
        } else if (action.equals("factor")) {
            temp=1;
            for (int i = 1; i <=number.getUntil(); i++) {
                    temp*=i;
            }
        }
        result.setResult(temp);
        return result ;
    }
}
