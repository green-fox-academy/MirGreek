package com.greenfoxacademy.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/todo")
public class TodoController {

    @ResponseBody
    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        return "this is my first todo";
    }
}