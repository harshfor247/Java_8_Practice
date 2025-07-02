package org.example;

public class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return "Book{" + title + ", genre=" + genre + "}";
    }
}
