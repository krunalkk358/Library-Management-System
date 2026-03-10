package org.lbms.app.factory;


import org.lbms.app.model.Book;

public class BookFactory {

    public static Book createBook(String title, String author, String isbn, int year) {
        return new Book(title, author, isbn, year);
    }

}