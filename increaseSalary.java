package org.example;

import java.util.Arrays;
import java.util.List;

public class increaseSalary {
    public static void main(String[] args) {
        List<Employees> employee = Arrays.asList(
                new Employees("Harsh", 24, 1, "Delivery & Implementation", 41000),
                new Employees("Sunand", 26, 2, "Backend", 115000),
                new Employees("Smile", 25, 3, "Backend", 70000),
                new Employees("Shubham", 27, 4, "Backend", 85000)
        );
        employee.forEach(e ->
                e.setSalary(e.getSalary() * 110/100)
        );
        employee.forEach(System.out::println);
    }
}
