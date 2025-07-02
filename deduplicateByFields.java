package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class deduplicateByFields {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Harsh", "harsh@email.com"),
                new Employee("Sunand", "sunand@email.com"),
                new Employee("DuplicateHarsh", "harsh@email.com")
        );

        Set<String> seen = new HashSet<>();

        List<Employee> uniqueByEmail = employees.stream()
                .filter(emp -> seen.add(emp.getEmail()))  // Only add if not already present
                .collect(Collectors.toList());

        uniqueByEmail.forEach(System.out::println);
    }
}
