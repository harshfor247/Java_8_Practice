package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class sortEmployees {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Harsh", 24, 1, "Delivery & Implementation",  41000),
                new Employees("Sunand", 26, 2, "Backend", 115000),
                new Employees("Smile", 25, 3, "Backend", 70000),
                new Employees("Shubham", 27, 4, "Backend", 85000)
        );

        List<Employees> sortedEmployees = employees.stream()
                .sorted(
                        Comparator.comparing(Employees::getName)
                                .thenComparing(Employees::getSalary)
                )
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);
    }
}
