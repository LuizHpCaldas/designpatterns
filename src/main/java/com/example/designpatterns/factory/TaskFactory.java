package com.example.designpatterns.factory;

public class TaskFactory {

    public static Task createTask(String type, String description) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleTask(description);
        } else if (type.equalsIgnoreCase("complex")) {
            return new ComplexTask(description);
        }
        throw new IllegalArgumentException("Unknown task type");
    }
}
