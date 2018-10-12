package com.greenfoxacademy.trybuiltinauthentication.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class FirstSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
    auth
        .inMemoryAuthentication()
          .withUser("username")
          .password("123")
          .roles("USER")
        .and()
          .withUser("adminname")
          .password("456")
          .roles("ADMIN");
  }

}
