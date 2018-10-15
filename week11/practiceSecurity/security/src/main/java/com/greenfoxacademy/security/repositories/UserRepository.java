package com.greenfoxacademy.security.repositories;

import com.greenfoxacademy.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
  User findByName(String name);
}
