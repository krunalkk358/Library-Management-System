package org.lbms.app.branch;


import org.lbms.app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryBranch {

    private String branchName;

    private List<Book> books = new ArrayList<>();

    public LibraryBranch(String branchName) {
        this.branchName = branchName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void transferBook(Book book, LibraryBranch targetBranch) {

        if (books.remove(book)) {
            targetBranch.addBook(book);
        }

    }

}