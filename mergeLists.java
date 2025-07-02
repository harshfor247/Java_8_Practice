package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeLists {
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("Apple", "Banana");
        List<String> list2 = Arrays.asList("Cat", "Dog");
        List<String> list3 = Arrays.asList("Eat", "Drink");
        List<String> res = Stream.of(list1,list2,list3)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
