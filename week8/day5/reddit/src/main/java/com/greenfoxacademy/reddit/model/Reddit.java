package com.greenfoxacademy.reddit.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reddit {
    String name;
    long likeOfReddit;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    public Reddit(String name, long likeOfReddit, long id) {
        this.name = name;
        this.likeOfReddit = likeOfReddit;
        this.id = id;
    }

    public Reddit(String name) {
        this.name = name;
    }

    public Reddit() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLikeOfReddit() {
        return likeOfReddit;
    }

    public void setLikeOfReddit(long like) {
        this.likeOfReddit = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
