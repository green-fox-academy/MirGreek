package com.greenfoxacademy.todo;


import com.greenfoxacademy.todo.model.Person;
import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.PersonRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private PersonRepository personRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("daily task",true,false));
        todoRepository.save(new Todo("make the bed",true,false));
        todoRepository.save(new Todo("do the washing up",false,false));
        todoRepository.save(new Todo("walk the dog",true,true));
        todoRepository.save(new Todo("go for a run",false,false));
        todoRepository.save(new Todo("do some cookie",true,true));
    }
    public void addTodoToPerson(){
        personRepository.save(new Person());

    }
}