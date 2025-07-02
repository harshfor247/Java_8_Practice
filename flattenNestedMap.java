package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class flattenNestedMap {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();

        Map<String, Integer> mathScores = new HashMap<>();
        mathScores.put("Alice", 90);
        mathScores.put("Bob", 85);

        Map<String, Integer> scienceScores = new HashMap<>();
        scienceScores.put("Alice", 95);
        scienceScores.put("Bob", 88);

        nestedMap.put("Math", mathScores);
        nestedMap.put("Science", scienceScores);

        List<String> flatList = nestedMap.entrySet().stream()
                .flatMap(outer -> outer.getValue().entrySet().stream()
                        .map(inner -> outer.getKey() + " - " + inner.getKey() + " = " + inner.getValue()))
                .collect(Collectors.toList());

        flatList.forEach(System.out::println);
    }
}
