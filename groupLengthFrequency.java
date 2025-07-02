package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class groupLengthFrequency {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Banana", "madam", "hello", "racecar", "pen", "air", "sis");
        Map<Integer, Long> res = str.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        res.forEach((length, count) ->
                System.out.println("Length: " + length + " -> " + count + " words(s)"));
    }
}
