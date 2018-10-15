package com.greenfoxacademy.security.controllers;

import com.greenfoxacademy.security.models.User;
import com.greenfoxacademy.security.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  UserRepository userRepository;
  BCryptPasswordEncoder bCryptPasswordEncoder;

  public UserController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userRepository = userRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @PostMapping("/sign-up")
  public void signUp( @RequestBody User user ){
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userRepository.save(user);
  }

}
