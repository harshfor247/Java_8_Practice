package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class highestRating {
    public static void main(String[] args){
        List<Product> products = Arrays.asList(
                new Product("iPhone", 56000, 9.5),
                new Product("Fortuner", 5500000, 10),
                new Product("tShirt", 600, 6.3)
        );
        Optional<Product> highestRatedProduct = products.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Product::getRating)));
        System.out.println(highestRatedProduct);
    }
}
