package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class distinctSkills {
    public static void main(String[] args) {
        Empl e1 = new Empl("Harsh", Arrays.asList("Java", "Spring", "SQL"));
        Empl e2 = new Empl("Sunand", Arrays.asList("Python", "Spring", "MongoDB"));
        Empl e3 = new Empl("Smile", Arrays.asList("Java", "Docker", "Kubernetes"));

        List<Empl> employees = Arrays.asList(e1, e2, e3);

        List<String> distinctSkills = employees.stream()
                .flatMap(emp -> emp.getSkills().stream())  // Flatten List<List<String>> to Stream<String>
                .distinct()                                // Remove duplicates
                .collect(Collectors.toList());             // Collect to List

        System.out.println("Distinct Skills:");
        distinctSkills.forEach(System.out::println);
    }
}
