package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.*;
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


    public WhatResult sumMultiplyOrDouble(ArrayModel numArray ){

        WhatResult result = new WhatResult();


        int temp=0;                                //pl. [1,2,3] -> 1+2+3 =6

         if(numArray.getWhat().equals("sum")){
             for (int i = 0; i <numArray.getNumbers().length ; i++) {
                   temp+= numArray.getNumbers()[i];
             }
                //numArray.setResult(temp);
                result.setResult(temp);
                return result;

         }else if (numArray.getWhat().equals("multiply")){ //pl. [1,2,3] -> 1*2*3 =6
             temp=1;
             for (int i = 0; i <numArray.getNumbers().length ; i++) {
                    temp*=numArray.getNumbers()[i];
             }

             result.setResult(temp);
             return result;
         } else if (numArray.getWhat().equals("double")){
             int [] doubled = new int[numArray.getNumbers().length];
             for (int i = 0; i <numArray.getNumbers().length ; i++) {
                   doubled[i]= numArray.getNumbers()[i]*2;
             }

             result.setResult(temp);
             return result;
         } else return null;












    }
}
