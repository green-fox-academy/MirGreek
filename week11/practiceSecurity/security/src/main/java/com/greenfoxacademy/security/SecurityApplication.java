package com.greenfoxacademy.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class SecurityApplication {

    @GetMapping("/")
    public String sayHello(){
      return "Hello";
    }

  public static void main(String[] args) {
    SpringApplication.run(SecurityApplication.class, args);
  }
}
