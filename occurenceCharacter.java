package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurenceCharacter {
    public static void main(String[] args){
        String str = "Hello World! Harsh this side.";
        Map<Character, Long> res = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c!=' ' )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        res.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
