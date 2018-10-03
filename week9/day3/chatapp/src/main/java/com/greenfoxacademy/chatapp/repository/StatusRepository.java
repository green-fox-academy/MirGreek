package com.greenfoxacademy.chatapp.repository;

import com.greenfoxacademy.chatapp.model.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status,Long> {
}
