package org.lbms.app.model;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book) {
        this.book = book;
        this.borrowDate = LocalDate.now();
    }

    public Book getBook() { return book; }

    public LocalDate getBorrowDate() { return borrowDate; }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}