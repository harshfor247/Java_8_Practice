package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class filterDepartmentSalary {
    public static void main(String[] args) {
        List<Employees> employee = Arrays.asList(
                new Employees("Harsh", 24, 1, "Delivery & Implementation", 41000),
                new Employees("Sunand", 26, 2, "Backend", 115000),
                new Employees("Smile", 25, 3, "Backend", 70000),
                new Employees("Shubham", 27, 4, "Backend", 85000)
        );
        Map<String, Integer> totalSalaryByDept = employee.stream()
                .collect(Collectors.groupingBy(
                        Employees::getDept,
                        Collectors.summingInt(Employees::getSalary)
                ));
        List<String> res = totalSalaryByDept.entrySet().stream()
                .filter(e -> e.getValue()>80000)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
