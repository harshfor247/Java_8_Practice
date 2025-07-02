package org.example;

import java.util.Optional;

public class optionalPipeline {
    public static void main(String[] args) {
        Person person = new Person("Harsh", "harsh@gmail.com");

        String email = Optional.ofNullable(person)
                .map(Person::getEmail)
                .filter(e -> e.endsWith("@gmail.com"))
                .orElse("no-email");

        System.out.println("Email: " + email);
    }
}