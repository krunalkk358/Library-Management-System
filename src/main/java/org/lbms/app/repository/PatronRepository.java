package org.lbms.app.repository;



import org.lbms.app.model.Patron;

import java.util.HashMap;
import java.util.Map;

public class PatronRepository {

    private Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }

    public Patron getPatron(String id) {
        return patrons.get(id);
    }
}