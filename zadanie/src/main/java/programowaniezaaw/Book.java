package programowaniezaaw;

import java.util.ArrayList;
import java.util.List;

class Book {

    private static List<Book> books;

    private String nameB;

    private String isbn;

    private int year;

    private BindingType binding;

    List<Author> authors;

    private int bookCategory;


    public Book(String nameB, String isbn, int year, BindingType binding, List<Author> authors, int bookCategory) {
        this.nameB = nameB;
        this.isbn = isbn;
        this.year = year;
        this.binding = binding;
        this.authors = authors;
        this.bookCategory = bookCategory;
    }

    public static void setBooks(List<Book> books) {
        Book.books = books;
    }

    public static List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Book name is: " + nameB +
                ", isbn is: " + isbn +
                ", year is: " + year +
                ", binding type: " + binding +
                ", authors id: " + authors +
                ", book category: " + bookCategory;
    }

    public BindingType getBinding() {
        return binding;
    }

    public int getBookCategory() {
        return bookCategory;
    }

    public String getNameB() {
        return nameB;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getAuthors() {
        return authors;
    }



    public void setYear(int year) {
        this.year = year;
    }
}
