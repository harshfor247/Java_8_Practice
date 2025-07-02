package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class removingNulls {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Apple", null, "Banana", "Cat", null);
        List<String> res = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
