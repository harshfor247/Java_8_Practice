package org.example;

import java.util.List;

class Emp {
    private String name;
    private List<Project> projects;
    public Emp(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }
    public List<Project> getProjects() { return projects; }
}