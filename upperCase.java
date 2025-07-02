package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upperCase {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello", "Shubham", "Smile", "and", "Sunand!");
        List<String> upperCaseList = list.stream()
                .map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.print(upperCaseList);
    }
}
