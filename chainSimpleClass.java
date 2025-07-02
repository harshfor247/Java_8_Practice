package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class chainSimpleClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "dog", "umbrella", "egg", "car", "orange", "ice");

        List<String> result = words.stream()
                .filter(word -> word.length() > 3)
                .filter(word -> word.matches("^[aeiouAEIOU].*"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
