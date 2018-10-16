package com.greenfoxacademy.todo.repository;

import com.greenfoxacademy.todo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
