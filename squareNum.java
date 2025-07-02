package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squareNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4,3,9876,5432,43,234,45,1,2);
        List<Integer> res = list.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.print(res);
    }
}
