package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class bookGenreGrouping {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Harry Potter", "Fantasy"),
                new Book("The Hobbit", "Fantasy"),
                new Book("1984", "Dystopian"),
                new Book("Brave New World", "Dystopian"),
                new Book("The Silent Patient", "Thriller")
        );

        Map<String, Long> genreCount = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));

        genreCount.forEach((genre, count) ->
                System.out.println(genre + " -> " + count + " book(s)")
        );
    }
}
