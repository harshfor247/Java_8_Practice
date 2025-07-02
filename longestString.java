package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class longestString {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Alice", "Bob", "Charlie", "Duke", "Esha", "Frank");
        Optional<String> longestString = str.stream()
                        .collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(longestString);
    }
}
