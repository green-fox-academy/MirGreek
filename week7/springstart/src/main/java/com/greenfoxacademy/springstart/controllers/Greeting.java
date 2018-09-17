package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
   private long id;
   private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public long getId() {
    return id;
  }




}
