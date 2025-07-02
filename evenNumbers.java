package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumbers {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(24,73,2,98,6543,234,98,34,5,7,123);
        List<Integer> evenNum = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);
    }
}
