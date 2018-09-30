package com.greenfoxacademy.reddit.service;
import com.greenfoxacademy.reddit.RedditRepository;
import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RedditServiceImpl implements RedditSevice {
    List<Reddit> redditList;
    RedditRepository redditRepository;

    @Autowired
    public RedditServiceImpl(RedditRepository redditRepository) {
        this.redditList = new ArrayList<>();
        this.redditRepository = redditRepository;
    }


    @Override
    public List<Reddit> createReddit(String title, String url) {
       Reddit reddit = new Reddit(title,url);
       redditList.add(reddit);
        redditRepository.save(reddit);
        return redditList;
    }

    @Override
    public void addLike(long id) {
       Reddit reddit = redditRepository.findById(id).get();
       if(reddit!=null) {
           reddit.setLikeOfReddit(reddit.getLikeOfReddit() + 1);
           redditRepository.save(reddit);
       }
    }

    @Override
    public void TakeLike(long id) {
        Reddit reddit=redditRepository.findById(id).get();
        if (reddit!=null) {
            reddit.setLikeOfReddit(reddit.getLikeOfReddit() - 1);
            redditRepository.save(reddit);
        }
    }
}
