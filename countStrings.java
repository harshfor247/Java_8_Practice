package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countStrings {
    public static void main(String[] args){
         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
         int numberOfStrings = Math.toIntExact(names.stream()
                 .collect(Collectors.counting()));
         System.out.println(numberOfStrings);
    }
}
