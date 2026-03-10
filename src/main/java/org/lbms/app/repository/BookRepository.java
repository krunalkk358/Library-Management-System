package org.lbms.app.repository;


import org.lbms.app.model.Book;

import java.util.*;

public class BookRepository {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public Book findByISBN(String isbn) {
        return books.get(isbn);
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }
}