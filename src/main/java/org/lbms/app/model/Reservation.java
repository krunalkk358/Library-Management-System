package org.lbms.app.model;

public class Reservation {

    private Book book;
    private Patron patron;

    public Reservation(Book book, Patron patron) {
        this.book = book;
        this.patron = patron;
    }

    public Book getBook() { return book; }

    public Patron getPatron() { return patron; }
}