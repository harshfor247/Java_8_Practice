package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Helo", "how", "are", "you", "are", "Doing?");
        List<String> res = str.stream().distinct().collect(Collectors.toList());
        System.out.print(res);
    }
}
