package com.greenfoxacademy.reddit.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reddit {
    String name;
    String url;
    long likeOfReddit;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    public Reddit(String name, long likeOfReddit, long id, String url) {
        this.name = name;
        this.likeOfReddit = likeOfReddit;
        this.id = id;
        this.url = url;
    }

    public Reddit(String name,String url) {
        this.name = name;
        this.url = url;
    }

    public Reddit() {
    }

    public Reddit(String name) {
        this.name = name;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
