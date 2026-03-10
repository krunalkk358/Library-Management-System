package org.lbms.app.model;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String id;
    private String name;

    private List<Loan> loanHistory = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public List<Loan> getLoanHistory() { return loanHistory; }

    public void addLoan(Loan loan) {
        loanHistory.add(loan);
    }
}