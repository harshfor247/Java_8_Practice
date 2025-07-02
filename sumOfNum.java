package org.example;

import java.util.Arrays;
import java.util.List;

public class sumOfNum {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(32,543,1234,876,43,1234,657463);
        int sum = num.stream().mapToInt(x -> x).sum();
        System.out.print(sum);
    }
}
