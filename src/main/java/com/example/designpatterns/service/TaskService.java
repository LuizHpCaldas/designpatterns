package com.example.designpatterns.service;

import com.example.designpatterns.model.TaskEntity;
import com.example.designpatterns.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public TaskEntity createTask(TaskEntity task) {
        return taskRepository.save(task);
    }

    public TaskEntity updateTask(Long id, TaskEntity taskDetails) {
        TaskEntity task = taskRepository.findById(id).orElseThrow();
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}