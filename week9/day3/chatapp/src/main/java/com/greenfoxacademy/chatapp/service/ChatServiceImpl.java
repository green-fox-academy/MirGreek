package com.greenfoxacademy.chatapp.service;

import com.greenfoxacademy.chatapp.model.User;
import com.greenfoxacademy.chatapp.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    ChatRepository chatRepository;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    @Override
    public User createUserByName(String name) {
        User user = new User(name);
        chatRepository.save(user);
        return user;
    }
}
