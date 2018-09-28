package com.greenfoxacademy.todo.model;



import javax.persistence.*;

@Entity //Spring knows that it is gonna be the database
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;
    @ManyToOne
    private Person owner;



    public Todo(String title) {
        this.title = title;
        urgent=false;
        done=false;
    }

    public Todo() {
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    public boolean ifFounddTitle(String title){
        if(this.getTitle().equals(title)){
            return true;
        }else return false;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
        owner.giveTodo(this);
    }
}
