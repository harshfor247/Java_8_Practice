package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class flattenTasks {
    public static void main(String[] args) {
        // Sample Data
        Task t1 = new Task("Design");
        Task t2 = new Task("Develop");
        Task t3 = new Task("Test");

        Project p1 = new Project("ProjectA", Arrays.asList(t1, t2));
        Project p2 = new Project("ProjectB", Arrays.asList(t3));

        Emp e1 = new Emp("Harsh", Arrays.asList(p1));
        Emp e2 = new Emp("Sunand", Arrays.asList(p2));

        List<Emp> employees = Arrays.asList(e1, e2);

        // Flatten to List<Task>
        List<Task> allTasks = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .flatMap(proj -> proj.getTasks().stream())
                .collect(Collectors.toList());

        System.out.println("All Tasks:");
        allTasks.forEach(System.out::println);
    }
}
