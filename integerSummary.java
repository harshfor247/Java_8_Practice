package org.example;

import java.util.*;
import java.util.IntSummaryStatistics;

public class integerSummary {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 35, 40, 5, 60);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Min     : " + stats.getMin());
        System.out.println("Max     : " + stats.getMax());
        System.out.println("Sum     : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Count   : " + stats.getCount());
    }
}
