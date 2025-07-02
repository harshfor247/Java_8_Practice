package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class palindrome {
    public static void main(String[] args){
        List<String> str =  Arrays.asList("Banana", "madam", "hello", "racecar", "pen", "air", "sis");
        Map<Boolean, List<String>> res = str.stream()
                .collect(Collectors.partitioningBy(palindrome::isPalindrome));
        System.out.println("Palindromes:- " + res.get(true));
        System.out.println("Non-Palindromes:- " + res.get(false));
    }
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
