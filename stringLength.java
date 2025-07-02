package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringLength {
    public static void main(String[] args){
        List<String> str = Arrays.asList("ABdrd", "qygdhv", "Harsh", "Hey", "and", "13yhi?");
        List<Integer> res = str.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.print(res);
    }
}
