package com.todo.todo.service;

import com.todo.todo.model.Task;
import com.todo.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;
    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public String deleteById(int id) {
        taskRepository.deleteById(id);
        return "Deleted";
    }

    @Override
    public Task getTaskById(int id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public String updateByID(Task task) {
        taskRepository.save(task);
        return "Success";
    }
}
