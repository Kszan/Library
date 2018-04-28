package programowaniezaaw;

import java.util.ArrayList;

public class BookData {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    private static BookData instance = new BookData();

    private BookData() {}

    public static BookData getInstance() {
        return instance;
    }


}