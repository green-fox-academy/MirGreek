package com.greenfoxacademy.todo.repository;
import com.greenfoxacademy.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAll();
    List<Todo> findAllByDoneFalse();
    Todo findById(long id);
    List<Todo> findByTitle(String title);


}
