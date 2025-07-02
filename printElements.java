package org.example;

import java.util.Arrays;
import java.util.List;

public class printElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 756, 2, 98, 876, 234);
        list.forEach(x -> System.out.println(x));
    }
}