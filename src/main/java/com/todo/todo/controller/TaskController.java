package com.todo.todo.controller;

import com.todo.todo.model.Task;
import com.todo.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public String add(@RequestBody Task task){
        taskService.saveTask(task);
        return "task added";
    }

    @GetMapping("/get")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return taskService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    public Task getTask(@PathVariable("id") int id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Task task) {
        return taskService.updateByID(task);
    }
}
