package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }



    //@ResponseBody // returnben nem html nevet, hanem pl stringet
    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value="isActive", required = false)String active) {
        if (active == null || active.equals("false")){
            model.addAttribute("todolist",todoRepository.findAllByDoneFalse());
        } else
            model.addAttribute("todolist",todoRepository.findAll());
        return "todolist";
    }

    @GetMapping(value={"/add"})
    public String addPage(){
        return "addform";
    }

    @PostMapping(value={"/add"})
   public String addAndPost(@RequestParam(value="additem")String addTodo){
        todoRepository.save(new Todo(addTodo));
        return "redirect:/todo/list";
    }
}