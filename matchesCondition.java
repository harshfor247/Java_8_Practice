package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class matchesCondition {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(24,97,13,45,57,31);
        Optional<Integer> res = num.stream().filter(x -> x>50).findFirst();
        res.ifPresentOrElse(
                n -> System.out.print("First match: " + n),
                () -> System.out.print("No match found!")
        );
    }
}
