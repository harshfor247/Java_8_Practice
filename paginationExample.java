package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class paginationExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            items.add("Item-" + i);
        }

        int offset = 10;  // Skip first 10
        int pageSize = 5; // Limit to next 5

        List<String> page = items.stream()
                .skip(offset)
                .limit(pageSize)
                .collect(Collectors.toList());

        page.forEach(System.out::println);
    }
}
