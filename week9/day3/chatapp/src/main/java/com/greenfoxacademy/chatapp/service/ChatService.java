package com.greenfoxacademy.chatapp.service;

import com.greenfoxacademy.chatapp.model.Message;
import com.greenfoxacademy.chatapp.model.Status;
import com.greenfoxacademy.chatapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public interface ChatService {
    User createUserByName(String name);
    Status setErrorMessage();
    public void addText(Long id, String text);
}
