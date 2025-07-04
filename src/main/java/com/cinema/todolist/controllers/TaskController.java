package com.cinema.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return List.of("Tâche 1", "Tâche 2", "Tâche 3");
    }
    @PostMapping("/test")
    public String test() {
        return "test";
    }
}