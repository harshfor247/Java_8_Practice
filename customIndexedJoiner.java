package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class customIndexedJoiner {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");

        // Create custom collector
        AtomicInteger index = new AtomicInteger(0);
        Collector<String, StringBuilder, String> indexedJoiner = Collector.of(
                StringBuilder::new,                                 // supplier
                (sb, s) -> {
                    if (sb.length() > 0) sb.append(", ");
                    sb.append(index.getAndIncrement()).append(":").append(s);
                },
                StringBuilder::append,                              // combiner (used for parallel)
                StringBuilder::toString                             // finisher
        );

        String result = items.stream().collect(indexedJoiner);
        System.out.println(result);
    }
}
