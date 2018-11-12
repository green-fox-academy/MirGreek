package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  public List<Todo> findAllByDoneFalse();
  List<Todo> findAll();
  Todo addAndSaveTodo(String todo);

}
