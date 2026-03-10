package org.lbms.app.strategy;


import org.lbms.app.model.Book;
import org.lbms.app.model.Patron;

import java.util.List;

public interface RecommendationStrategy {

    List<Book> recommend(Patron patron, List<Book> allBooks);

}