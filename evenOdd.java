package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1,3,5325,46537,34654,57,54,12,4,214,32,5,233,5,32,4);
        Map<Boolean, List<Integer>> res = num.stream().collect(Collectors.partitioningBy(x -> x%2==0));
        System.out.println("Even numbers: " + res.get(true));
        System.out.println("Odd numbers: " + res.get(false));
    }
}
