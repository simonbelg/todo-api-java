package com.cinema.todolist.services;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    public List<Task> getTasks() {
        return List.of();
    }
}
