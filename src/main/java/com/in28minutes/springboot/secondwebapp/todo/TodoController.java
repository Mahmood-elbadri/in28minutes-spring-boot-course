package com.in28minutes.springboot.secondwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public String listTodos(ModelMap mode) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        mode.addAttribute("todos", todos);
        return "listTodos";
    }

    @GetMapping("/add-todo")
    public String showNewTodoPage() {
        return "todo";
    }

    @PostMapping("/add-todo")
    public String showTodoListPage(@RequestParam String description, ModelMap model) {
        String username = (String) model.getAttribute("name");
        todoService.addTodo(username, description, LocalDate.now(), false);
        return "redirect:/list-todos";
    }
}
