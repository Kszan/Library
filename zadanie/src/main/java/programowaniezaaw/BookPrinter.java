package programowaniezaaw;

import java.util.List;

public class BookPrinter {
    private BooksPrintStrategy booksPrintStrategy;

    public BookPrinter(BooksPrintStrategy booksPrintStrategy) {
        this.booksPrintStrategy = booksPrintStrategy;
    }

    public void setBooksPrintStrategy(BooksPrintStrategy booksPrintStrategy) {
        this.booksPrintStrategy = booksPrintStrategy;
    }
    public void showBooks(List<Book> allBooks) {
        booksPrintStrategy.print(allBooks);
    }
}