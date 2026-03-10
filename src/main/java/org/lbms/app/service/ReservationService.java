package org.lbms.app.service;


import org.lbms.app.model.Book;
import org.lbms.app.model.Patron;
import org.lbms.app.model.Reservation;

import java.util.*;

public class ReservationService {

    private Map<String, Queue<Reservation>> reservations = new HashMap<>();

    public void reserveBook(Book book, Patron patron) {

        reservations.putIfAbsent(book.getIsbn(), new LinkedList<>());

        reservations.get(book.getIsbn()).add(new Reservation(book, patron));

        System.out.println("Book reserved successfully");
    }

    public Reservation getNextReservation(Book book) {

        Queue<Reservation> queue = reservations.get(book.getIsbn());

        if (queue != null) {
            return queue.poll();
        }

        return null;
    }
}