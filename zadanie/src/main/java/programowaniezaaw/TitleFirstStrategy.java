package programowaniezaaw;

import java.util.List;

public class TitleFirstStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println(book.getNameB() + ", " + book.getYear()
                + ", " + book.getIsbn() + ", " + book.getBinding()));
    }
}
