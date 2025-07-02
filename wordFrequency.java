package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class wordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful";

        Map<String, Long> wordFrequency = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(
                        word -> word.toLowerCase(),
                        Collectors.counting()
                ));

        wordFrequency.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }
}
