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
    @PostMapping(value="/delete")
    public String deleteTodo(@ModelAttribute(value="delete")long id){
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }
    @GetMapping(value="/{id}/edit")
    public String editPage(){
        return "edit";
    }
    @PostMapping(value = "/{id}/edit")
    public String editTodo(@PathVariable (value="id")long id,Model model,
                           //@ModelAttribute(value="editTodo")Todo todo,
                           @RequestParam(value = "title")String title,
                           @RequestParam (value = "urgent",required = false)boolean urgent,
                           @RequestParam(value = "done",required = false)boolean done) {
           Todo todo = todoRepository.findById(id);
            todo.setTitle(title);
            todo.setUrgent(urgent);
            todo.setDone(done);
        model.addAttribute("editTodo",todoRepository.save(todo));
        return "redirect:/todo/list";
    }
}