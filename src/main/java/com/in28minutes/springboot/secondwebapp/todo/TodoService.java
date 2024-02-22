package com.in28minutes.springboot.secondwebapp.todo;

import com.in28minutes.springboot.secondwebapp.todo.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

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
        Predicate<? super Todo> predicate = todo -> Objects.equals(todo.getUsername(), username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String desc, LocalDate date, boolean done) {
        ++todosCount;
        Todo todo = new Todo(++todosCount, username, desc, date, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
    
}
