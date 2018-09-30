package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepository extends CrudRepository<Reddit,Long> {
    List<Reddit> findAll();


}
