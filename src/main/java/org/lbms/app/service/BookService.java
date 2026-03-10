package org.lbms.app.service;


import org.lbms.app.model.Book;
import org.lbms.app.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public Book searchByISBN(String isbn) {
        return repository.findByISBN(isbn);
    }

    public List<Book> searchByTitle(String title) {

        List<Book> result = new ArrayList<>();

        for (Book b : repository.getAllBooks()) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                result.add(b);
            }
        }

        return result;
    }

}