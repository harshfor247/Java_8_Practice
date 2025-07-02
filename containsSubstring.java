package org.example;

import java.util.Arrays;
import java.util.List;

public class containsSubstring {
    public static void main(String[] args){
        List<String> list = Arrays.asList("happy", "appy", "application", "now", "is", "cap");
        String str = "ap";
        boolean res = list.stream().anyMatch(c -> c.contains(str));
        System.out.println("Any name contains " + str + "? -> " + res);
    }
}
