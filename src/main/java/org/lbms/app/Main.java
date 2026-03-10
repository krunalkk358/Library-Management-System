package org.lbms.app;


import org.lbms.app.factory.BookFactory;
import org.lbms.app.model.Book;
import org.lbms.app.model.Patron;
import org.lbms.app.repository.BookRepository;
import org.lbms.app.repository.PatronRepository;
import org.lbms.app.service.BookService;
import org.lbms.app.service.LendingService;
import org.lbms.app.service.ReservationService;

public class Main {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();
        PatronRepository patronRepository = new PatronRepository();

        BookService bookService = new BookService(bookRepository);
        LendingService lendingService = new LendingService();
        ReservationService reservationService = new ReservationService();

        Book book1 = BookFactory.createBook(
                "Clean Code",
                "Robert Martin",
                "ISBN001",
                2008
        );

        bookRepository.addBook(book1);

        Patron patron = new Patron("P1", "Krunal");

        patronRepository.addPatron(patron);

        lendingService.checkoutBook(book1, patron);

        lendingService.returnBook(book1);

        reservationService.reserveBook(book1, patron);

        System.out.println("Library System Running Successfully");

    }

}