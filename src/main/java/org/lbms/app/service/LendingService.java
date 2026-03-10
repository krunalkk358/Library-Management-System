package org.lbms.app.service;


import org.lbms.app.model.Book;
import org.lbms.app.model.Loan;
import org.lbms.app.model.Patron;

import java.util.HashMap;
import java.util.Map;

public class LendingService {

    private Map<String, Loan> activeLoans = new HashMap<>();

    public void checkoutBook(Book book, Patron patron) {

        if (!book.isAvailable()) {
            System.out.println("Book already borrowed");
            return;
        }

        Loan loan = new Loan(book);
        activeLoans.put(book.getIsbn(), loan);

        book.setAvailable(false);

        patron.addLoan(loan);

        System.out.println("Book checked out successfully");
    }

    public void returnBook(Book book) {

        Loan loan = activeLoans.get(book.getIsbn());

        if (loan != null) {
            loan.returnBook();
            book.setAvailable(true);
            activeLoans.remove(book.getIsbn());
        }
    }
}