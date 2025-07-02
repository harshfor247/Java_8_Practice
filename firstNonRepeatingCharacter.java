package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("First non-repeating character: " + result.get());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
