package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortList {
    public static void main(String[] args){
        List<String> list = Arrays.asList("hey", "How", "are", "you", "Doing?");
        List<String> res = list.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.print(res);
    }
}
