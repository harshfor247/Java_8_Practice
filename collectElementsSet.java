package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class collectElementsSet {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(13243546,312435432,456,542,43465,243,456,533,24,3,5,2,5,3,5,324,563,423,45342,3);
        Set<Integer> Unique = list.stream()
                .collect(Collectors.toSet());
        System.out.println(Unique);
    }
}
