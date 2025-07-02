package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingWords {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Falcon", "Engineering", "FinTech", "Finance", "Eagle", "for");
        Map<Character, List<String>> res = str.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        res.forEach((c, list) -> System.out.println(c + "->" + list));
    }
}
