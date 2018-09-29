package com.greenfoxacademy.reddit.service;
import com.greenfoxacademy.reddit.RedditRepository;
import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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
    public void addLike(Reddit reddit) {
       long currentLike= reddit.getLikeOfReddit();
       currentLike++;
       reddit.setLikeOfReddit(currentLike);
    }

    @Override
    public void TakeLike(Reddit reddit) {
        long currentLike= reddit.getLikeOfReddit();
        currentLike--;
        reddit.setLikeOfReddit(currentLike);

    }
}
