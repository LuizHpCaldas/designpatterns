package com.example.designpatterns.factory;

public abstract class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}

class SimpleTask extends Task {

    public SimpleTask(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Executing simple task: " + getDescription());
    }
}

class ComplexTask extends Task {

    public ComplexTask(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Executing complex task: " + getDescription());
    }
}

