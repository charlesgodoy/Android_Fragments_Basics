package com.example.caz.androidfragmentbasicspractice;

import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    public static List<Book> getBooks(){


        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "Harry Potter 1");
        bookList.add(book);

        Book book1 = new Book("2", "Harry Potter 2");
        bookList.add(book1);
        Book book2 = new Book("3", "Harry Potter 3");
        bookList.add(book2);
        Book book3 = new Book("4", "Harry Potter 4");
        bookList.add(book3);
        Book book4 = new Book("5", "Harry Potter 5");
        bookList.add(book4);
        return bookList;
    }
}
