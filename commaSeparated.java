package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commaSeparated {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Apple", "Banana", "Cat", "Dog");
        String res = str.stream().collect(Collectors.joining(", "));
        System.out.println(res);
    }
}
