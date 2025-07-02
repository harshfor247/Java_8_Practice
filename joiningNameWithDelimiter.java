package org.example;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class joiningNameWithDelimiter {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Shubham", "Abhay", "Harsh", "Sunand", "Smile");
        String res = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(res);
    }
}
