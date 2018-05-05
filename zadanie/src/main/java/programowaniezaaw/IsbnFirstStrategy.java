package programowaniezaaw;

import java.util.List;

public class IsbnFirstStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println(book.getIsbn() + ", " + book.getYear()
                + ", " + book.getNameB()  + ", " + book.getBinding() + ", " + book.getAuthors() + ", " + book.getBookCategory()));
    }
}
