package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class collectStringLength {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Apple", "Banana", "Cat", "Dog");
        Map<Integer, List<String>> res = str.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(res);
    }
}
