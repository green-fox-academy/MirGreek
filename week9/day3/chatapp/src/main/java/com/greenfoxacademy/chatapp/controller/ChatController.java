package com.greenfoxacademy.chatapp.controller;

import com.greenfoxacademy.chatapp.model.Message;
import com.greenfoxacademy.chatapp.model.Status;
import com.greenfoxacademy.chatapp.repository.MessageRepository;
import com.greenfoxacademy.chatapp.repository.StatusRepository;
import com.greenfoxacademy.chatapp.repository.UserRepository;
import com.greenfoxacademy.chatapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatController {
    UserRepository userRepository;
    MessageRepository messageRepository;
    StatusRepository statusRepository;
    ChatService chatService;

    @Autowired
    public ChatController(UserRepository chatRepository, MessageRepository messageRepository, StatusRepository statusRepository, ChatService chatService) {
        this.userRepository = chatRepository;
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
    public String register(@ModelAttribute(value="name")String name,Model model){
        if(name==null){
            chatService.setErrorMessage();
        }
        chatService.createUserByName(name);
        model.addAttribute("user",userRepository.findAll());
        return "redirect:/";
    }

    //@PostMapping("/message")
    //public String sendMessage(@ModelAttribute(value="message")String message,
                           //   @ModelAttribute(value ="id")Long id){
        //chatService.addText(id,message);
        //return "redirect:/";
    //}



}
