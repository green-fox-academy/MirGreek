package com.greenfoxacademy.trybuiltinauthentication.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class FirstSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {

    auth
        .inMemoryAuthentication()
          .withUser("mir")
          .password("{noop}pass")
          .roles("USER")
        .and()
          .withUser("admin")
          .password("{noop}pword")
          .roles("ADMIN");
  }
  @Override
  protected void configure(HttpSecurity httpSec) throws Exception {
    httpSec
          .authorizeRequests()
          .anyRequest().authenticated()
          .antMatchers(HttpMethod.GET,"/")
            .permitAll()
          .antMatchers("/admin/**")
            .hasRole("ADMIN")
          .and()
            .formLogin()
            .permitAll()
          .and()
            .logout()
            .logoutSuccessUrl("/login?logout")
            .permitAll();

  }

}
