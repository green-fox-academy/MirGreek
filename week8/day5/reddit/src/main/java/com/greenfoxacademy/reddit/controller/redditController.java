package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.RedditRepository;
import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class redditController {

    private RedditRepository redditRepository;

    @Autowired
    public redditController(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }


    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("redditlist",redditRepository.findAll());
        return "index";
    }
    @GetMapping("/submit")
    public String submitNew(){
        return "submit";
    }


}
