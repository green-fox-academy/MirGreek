package com.greenfoxacademy.chatapp.controller;

import com.greenfoxacademy.chatapp.model.User;
import com.greenfoxacademy.chatapp.repository.ChatRepository;
import com.greenfoxacademy.chatapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class ChatController {
    ChatRepository chatRepository;
    ChatService chatService;

    @Autowired
    public ChatController(ChatRepository chatRepository, ChatService chatService) {
        this.chatRepository = chatRepository;
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
    public String register(@ModelAttribute(value="name")String name, Model model){
        chatService.createUserByName(name);
        //model.addAttribute("name",name);
        return "redirect:/";
    }


}
