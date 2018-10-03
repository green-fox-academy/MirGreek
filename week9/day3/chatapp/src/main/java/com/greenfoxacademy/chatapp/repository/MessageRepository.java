package com.greenfoxacademy.chatapp.repository;

import com.greenfoxacademy.chatapp.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Long> {
    List<Message> findAll();
}
