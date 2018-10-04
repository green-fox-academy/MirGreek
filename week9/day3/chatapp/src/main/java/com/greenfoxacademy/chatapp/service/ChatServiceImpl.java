package com.greenfoxacademy.chatapp.service;

import com.greenfoxacademy.chatapp.model.Message;
import com.greenfoxacademy.chatapp.model.Status;
import com.greenfoxacademy.chatapp.model.User;
import com.greenfoxacademy.chatapp.repository.MessageRepository;
import com.greenfoxacademy.chatapp.repository.StatusRepository;
import com.greenfoxacademy.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    UserRepository userRepository;
    MessageRepository messageRepository;
    StatusRepository statusRepository;

    @Autowired
    public ChatServiceImpl(UserRepository chatRepository, MessageRepository messageRepository, StatusRepository statusRepository) {
        this.userRepository = chatRepository;
        this.messageRepository = messageRepository;
        this.statusRepository = statusRepository;
    }


    @Override
    public User createUserByName(String name) {
        User user = new User(name);
        userRepository.save(user);
        return user;
    }

    @Override
    public Status setErrorMessage() {
        Status status = new Status("The username field is empty!");
        statusRepository.save(status);
        return status;
    }
    //public void giveMessageAUser(Long id, Message text){
     //User user = userRepository.findById(id).orElse(null);
       // userRepository.save(new Message(user,text))
    //}
    public void addText(Long id, String text){
        User user = userRepository.findById(id).orElse(null);
        messageRepository.save(new Message(user,text));

    }
}
