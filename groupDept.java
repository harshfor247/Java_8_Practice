package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupDept {
    public static void main(String[] args){
        List<Employees> list = Arrays.asList(
                new Employees("Harsh", 24, 1, "Delivery & Implementation",  41000),
                new Employees("Sunand", 26, 2, "Backend", 115000),
                new Employees("Smile", 25, 3, "Backend", 70000),
                new Employees("Shubham", 27, 4, "Backend", 85000)
        );
        Map<String, List<String>> res = list.stream()
                .collect(Collectors.groupingBy(Employees::getDept, Collectors.mapping(Employees::getName, Collectors.toList())));
        res.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
