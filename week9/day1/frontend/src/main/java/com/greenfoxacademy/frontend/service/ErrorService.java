package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.ErrorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {
  private  ErrorModel errorModel;

    @Autowired
    public ErrorService(ErrorModel errorModel) {
        this.errorModel = errorModel;
    }

    public ErrorService() {
    }

    public ErrorModel getErrorModel() {
        return errorModel;
    }

    public void setErrorModel(ErrorModel errorModel) {
        this.errorModel = errorModel;
    }
    public ErrorModel createError(String message){
        ErrorModel error=new ErrorModel(message);
        return error;
    }

}