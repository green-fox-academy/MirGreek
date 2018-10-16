package com.greenfoxacademy.security.service;


import com.greenfoxacademy.security.models.User;
import com.greenfoxacademy.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;
  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUserName(String userName) throws UsernameNotFoundException {
    User user = userRepository.findByName(userName);
    if (user == null){
      throw new UsernameNotFoundException(userName);
    }
    return (UserDetails) new User(user.getUserName(),user.getPassword());
  }
}
