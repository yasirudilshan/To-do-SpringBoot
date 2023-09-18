package com.todo.todo.service;

import com.todo.todo.model.Task;

import java.util.List;

public interface TaskService {
    public Task saveTask(Task task);
    public List<Task> getAllTasks();
    public String deleteById(int id);
    public Task getTaskById(int id);
    public String updateByID(Task task);
}
