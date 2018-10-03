package com.greenfoxacademy.chatapp.service;

import com.greenfoxacademy.chatapp.model.Status;
import com.greenfoxacademy.chatapp.model.User;
import com.greenfoxacademy.chatapp.repository.MessageRepository;
import com.greenfoxacademy.chatapp.repository.StatusRepository;
import com.greenfoxacademy.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    UserRepository chatRepository;
    MessageRepository messageRepository;
    StatusRepository statusRepository;

    @Autowired
    public ChatServiceImpl(UserRepository chatRepository, MessageRepository messageRepository, StatusRepository statusRepository) {
        this.chatRepository = chatRepository;
        this.messageRepository = messageRepository;
        this.statusRepository = statusRepository;
    }


    @Override
    public User createUserByName(String name) {
        User user = new User(name);
        chatRepository.save(user);
        return user;
    }

    @Override
    public Status setErrorMessage() {
        Status status = new Status("The username field is empty!");
        statusRepository.save(status);
        return status;
    }
}
