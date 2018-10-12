package com.greenfoxacademy.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configAuth(AuthenticationManagerBuilder auth) throws Exception {

    auth
        .inMemoryAuthentication()
        .withUser("mir")
        .password("pass")
        .roles("USER")
        .and()
        .withUser("admin")
        .password("pass")
        .roles("ADMIN");
  }
  
}
