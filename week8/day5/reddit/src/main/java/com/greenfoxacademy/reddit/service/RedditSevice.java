package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RedditSevice {
    public List<Reddit> createReddit(String title);
    public void addLike(Reddit reddit);
    public void TakeLike(Reddit reddit);
}
