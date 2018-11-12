package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Person;
import com.greenfoxacademy.todo.repository.PersonRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  PersonRepository personRepository;
  TodoRepository todoRepository;
  Person loggedInPerson;

  @Autowired
  public LoginController(PersonRepository personRepository, TodoRepository todoRepository) {
    this.personRepository = personRepository;
    this.todoRepository = todoRepository;
  }

 @GetMapping(value="/login")
  public String loginPage(){
   return "login";
  }

  @PostMapping(value="/login")
  public String givePerson(@ModelAttribute(value = "name")String name, Model model,
                           @ModelAttribute(value = "password")String password){
    Person person = new Person(name, password);
    loggedInPerson = person;
    //model.addAttribute("name",person);
    model.addAttribute("person",personRepository.save(person));
    model.addAttribute("todolist",todoRepository.findAll());
    return "index";
  }
}

