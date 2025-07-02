package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamPeekDebug {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "anna", "alex", "steve");

        List<String> result = names.stream()
                .peek(name -> System.out.println("Original: " + name))         // Step 1: raw input
                .filter(name -> name.startsWith("a"))                          // Filter: starts with 'a'
                .peek(name -> System.out.println("After filter: " + name))     // Step 2: after filter
                .map(String::toUpperCase)                                      // Map to UPPERCASE
                .peek(name -> System.out.println("After map: " + name))        // Step 3: after map
                .collect(Collectors.toList());                                 // Terminal op

        System.out.println("Result: " + result);
    }
}
