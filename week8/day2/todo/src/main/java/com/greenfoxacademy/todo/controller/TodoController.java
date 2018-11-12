package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Person;
import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.PersonRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import com.greenfoxacademy.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;
    private PersonRepository personRepository;
    private Person loggedInPerson;
    private TodoService todoService;
    
    @Autowired
    public TodoController(TodoRepository todoRepository, PersonRepository personRepository, Person loggedInPerson, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.personRepository = personRepository;
        this.loggedInPerson = loggedInPerson;
        this.todoService = todoService;
    }


    //@ResponseBody // returnben nem html nevet, hanem pl stringet
    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
        if (active == null || active.equals("false")) {
            model.addAttribute("todolist",todoService.findAllByDoneFalse() );
            model.addAttribute("person", loggedInPerson);
        } else
            model.addAttribute("todolist", todoService.findAll());
        model.addAttribute("person", loggedInPerson);
        return "index";
    }


    @PostMapping(value = {"/add"})
    public String addAndPost(@RequestParam(value = "additem") String addTodo) {
        if (addTodo != "")
            todoRepository.save(new Todo(addTodo));
        return "redirect:/todo/list/?isActive=true";
    }

    @PostMapping(value = "/delete")
    public String deleteTodo(@ModelAttribute(value = "delete") long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list/?isActive=true";
    }

    @GetMapping(value = "/{id}/edit")
    public String editPage(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("editTodo", todoRepository.findById(id));
        model.addAttribute("person", loggedInPerson);
        return "edit";
    }

    @PostMapping(value = "/{id}/edit")
    public String editTodo(@PathVariable(value = "id") long id, Model model,
                           @ModelAttribute(value = "editTodo") Todo todo,
                           @RequestParam(value = "title") String title,
                           @RequestParam(value = "urgent", required = false) boolean urgent,
                           @RequestParam(value = "done", required = false) boolean done) {
        todo = todoRepository.findById(id);
        todo.setTitle(title);
        todo.setUrgent(urgent);
        todo.setDone(done);
        model.addAttribute("editTodo", todoRepository.save(todo));
        return "redirect:/todo/list/?isActive=true";
    }


    @GetMapping(value = "/search")
    public String findTodo(@RequestParam(value = "title") String title, Model model) {
        if (title != "") {
            model.addAttribute("todolist", todoRepository.findByTitleContains(title));
            model.addAttribute("person", loggedInPerson);
            return "index";
        } else {
            model.addAttribute("person", loggedInPerson);
            return "index";
        }
    }
}