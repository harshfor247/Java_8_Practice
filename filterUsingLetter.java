package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterUsingLetter {
    public static void main(String[] args){
        List<String> list = Arrays.asList("ABCD", "and", "Mob", "usinG", "Anuj", "Yes", "you", "are");
        String letter ="a";
        List<String> res = list.stream()
                        .filter(x -> x.toLowerCase().startsWith(letter.toLowerCase()))
                        .collect(Collectors.toList());
        System.out.print(res);
    }
}