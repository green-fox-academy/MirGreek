package com.greenfoxacademy.todo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String password;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = ("owner")) //nem kell elmentenem mindig, hogy neki van todoja
    private List<Todo> todoList;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
        todoList = new ArrayList<>();
    }

    public Person() {
        todoList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void giveTodo(Todo todo){
        todoList.add(todo);
        todo.setOwner(this); //:)
    }
}
