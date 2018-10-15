package com.greenfoxacademy.security.repositories;

import com.greenfoxacademy.security.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
