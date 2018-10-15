package com.greenfoxacademy.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  public UserDetails loadUserByUserName(String userName);
}
