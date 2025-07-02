package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flattenListOfLists {
    public static void main(String[] args){
        List<List<String>> str = Arrays.asList(
                Arrays.asList("abc", "def", "ghi"),
                Arrays.asList("jkl", "mno", "pqr"),
                Arrays.asList("stu", "vwx", "yz")
        );
        List<String> res = str.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
