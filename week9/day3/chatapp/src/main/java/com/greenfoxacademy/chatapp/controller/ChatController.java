package com.greenfoxacademy.chatapp.controller;

import com.greenfoxacademy.chatapp.model.Status;
import com.greenfoxacademy.chatapp.repository.MessageRepository;
import com.greenfoxacademy.chatapp.repository.StatusRepository;
import com.greenfoxacademy.chatapp.repository.UserRepository;
import com.greenfoxacademy.chatapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatController {
    UserRepository chatRepository;
    MessageRepository messageRepository;
    StatusRepository statusRepository;
    ChatService chatService;

    @Autowired
    public ChatController(UserRepository chatRepository, MessageRepository messageRepository, StatusRepository statusRepository, ChatService chatService) {
        this.chatRepository = chatRepository;
        this.messageRepository = messageRepository;
        this.statusRepository = statusRepository;
        this.chatService = chatService;
    }


    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
    @GetMapping("/register")
    public String getRegister() {
        return "login";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute(value="name")String name, Status status){
        if(name==null){
            chatService.setErrorMessage();
        }
        chatService.createUserByName(name);
        return "redirect:/";
    }



}
