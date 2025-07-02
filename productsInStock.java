package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class productsInStock {
    public static void main(String[] args){
        List<Product> products = Arrays.asList(
                new Product("iPhone", 56000, 9.5),
                new Product("Fortuner", 5500000, 10),
                new Product("tShirt", 600, 6.3)
        );
        List<String> res = products.stream()
                .map(Product::getProductName)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
