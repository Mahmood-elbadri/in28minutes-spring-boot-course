package com.in28minutes.springboot.secondwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "dodo", "Learn AWS", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(2, "dodo", "Learn DevOps", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(3, "dodo", "Learn FullStack", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(4, "dodo", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }
}
