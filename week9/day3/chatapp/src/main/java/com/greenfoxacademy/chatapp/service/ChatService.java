package com.greenfoxacademy.chatapp.service;

import com.greenfoxacademy.chatapp.model.User;
import org.springframework.stereotype.Controller;

@Controller
public interface ChatService {
    User createUserByName(String name);
}
