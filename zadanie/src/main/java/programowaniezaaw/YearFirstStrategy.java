package programowaniezaaw;

import java.util.List;

public class YearFirstStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println(book.getYear() + ", " + book.getNameB()
                + ", " + book.getIsbn() + ", " + book.getBinding() + ", " + book.getAuthors() + ", " + book.getBookCategory()));
    }
}
