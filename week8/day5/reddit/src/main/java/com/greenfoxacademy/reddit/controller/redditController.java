package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.RedditRepository;
import com.greenfoxacademy.reddit.model.Reddit;
import com.greenfoxacademy.reddit.service.RedditSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Controller
public class redditController {

    private RedditRepository redditRepository;
    RedditSevice redditSevice;

    @Autowired
    public redditController(RedditRepository redditRepository, RedditSevice redditSevice) {
        this.redditRepository = redditRepository;
        this.redditSevice = redditSevice;
    }


    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("redditlist",redditRepository.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String submitNew(Model model){
        model.addAttribute(new Reddit());
        return "submit";
    }

    @PostMapping("/submit")
    public String postNew(@RequestParam(value = "name")String name,
                          @RequestParam(value = "url")String url,Reddit reddit,
                          Model model){
        redditSevice.createReddit(name,url);
        model.addAttribute("redditlist",redditRepository.save(reddit));
        return "index";
    }


}
