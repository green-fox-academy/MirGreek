package com.greenfoxacademy.chatapp.repository;

import com.greenfoxacademy.chatapp.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChatRepository extends CrudRepository<User,Long> {
    List<User> findAll();

}
