package com.example.designpatterns.facade;


import com.example.designpatterns.factory.Task;
import com.example.designpatterns.factory.TaskFactory;

import java.util.ArrayList;
import java.util.List;

public class TaskFacade {

    private List<Task> tasks;

    public TaskFacade() {
        tasks = new ArrayList<>();
    }

    public void createAndAddTask(String type, String description) {
        Task task = TaskFactory.createTask(type, description);
        tasks.add(task);
    }

    public void executeAllTasks() {
        for (Task task : tasks) {
            task.execute();
        }
    }
}
