package org.example;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class filterConditions {
    public static void main(String[] args){
        List<Employees> employee = Arrays.asList(
                new Employees("Harsh", 24, 1, "Delivery & Implementation",  41000),
                new Employees("Sunand", 26, 2, "Backend", 115000),
                new Employees("Smile", 25, 3, "Backend", 70000),
                new Employees("Shubham", 27, 4, "Backend", 85000)
        );
        List<String> names = employee.stream()
                .map(Employees::getName)
                .filter(c -> c.charAt(0)=='S')
                .collect(Collectors.toList());
        List<Integer> age = employee.stream()
                .map(Employees::getAge)
                .filter(c -> c>25)
                .collect(Collectors.toList());
        List<Integer> id = employee.stream()
                .map(Employees::getId)
                .filter(c -> c==2)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(age);
        System.out.println(id);
    }
}
