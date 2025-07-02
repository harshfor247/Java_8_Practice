package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class primeNonPrime {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Map<Boolean, List<Integer>> res = list.stream()
                .collect(Collectors.partitioningBy(primeNonPrime::isPrime));
        System.out.println("Prime numbers:- " + res.get(true));
        System.out.println("Non-Prime numbers:- " + res.get(false));
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i=3; i<Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
