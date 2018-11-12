package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.PersonRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import com.greenfoxacademy.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
  PersonRepository personRepository;
  TodoRepository todoRepository;
  UserRepository userRepository;

  @Autowired
  public TodoServiceImpl(PersonRepository personRepository, TodoRepository todoRepository, UserRepository userRepository) {
    this.personRepository = personRepository;
    this.todoRepository = todoRepository;
    this.userRepository = userRepository;
  }


  @Override
  public List<Todo> findAllByDoneFalse() {
   List<Todo> todoList = todoRepository.findAllByDoneFalse();
    return todoList;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = todoRepository.findAll();
    return todoList;
  }

  @Override
  public Todo addAndSaveTodo(String todo) {
    return null;
  }
}
