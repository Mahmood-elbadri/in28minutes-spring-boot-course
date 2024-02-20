package com.in28minutes.springboot.secondwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes("name")
@Controller
public class TodoController {
    private TodoService todoService;
//@Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/list-todos")
    public String listTodos(ModelMap mode){
        List<Todo> todos = todoService.findByUsername("in28minutes");
        mode.addAttribute("todos",todos);
        return "listTodos";
    }
}
