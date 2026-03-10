package org.lbms.app.strategy;


import org.lbms.app.model.Book;
import org.lbms.app.model.Patron;

import java.util.ArrayList;
import java.util.List;

public class HistoryBasedRecommendation implements RecommendationStrategy {

    @Override
    public List<Book> recommend(Patron patron, List<Book> allBooks) {

        List<Book> recommendations = new ArrayList<>();

        for (Book book : allBooks) {
            if (book.isAvailable()) {
                recommendations.add(book);
            }
        }

        return recommendations;
    }
}