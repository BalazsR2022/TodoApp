package com.todoapp.controllers;

import com.todoapp.models.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todo")
    public Todo getTodo() {
        Todo todo = new Todo("Kutyát sétáltatni", false);
        return todo;

    }
}
