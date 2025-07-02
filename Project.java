package org.example;

import java.util.List;

class Project {
    private String name;
    private List<Task> tasks;
    public Project(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }
    public List<Task> getTasks() { return tasks; }
}