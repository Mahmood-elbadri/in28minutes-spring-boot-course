package com.in28minutes.springboot.secondwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "dodo", "Learn AWS", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++todosCount, "dodo", "Learn DevOps", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++todosCount, "dodo", "Learn FullStack", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++todosCount, "dodo", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String desc, LocalDate date, boolean done) {
        ++todosCount;
        Todo todo = new Todo(++todosCount, username, desc, date, done);
        todos.add(todo);
    }
}
