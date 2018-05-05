package programowaniezaaw;

import java.util.List;

class Book {

    private String nameB;

    private String isbn;

    private int year;

    private BindingType binding;

    String authors;

    private int bookCategory;

    public Book(String nameB, String isbn, int year, BindingType binding, String authors, int bookCategory) {
        this.nameB = nameB;
        this.isbn = isbn;
        this.year = year;
        this.binding = binding;
        this.authors = authors;
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book name is: " + nameB +
                ", isbn is: " + isbn +
                ", year is: " + year +
                ", binding type: " + binding +
                ", authors id: " + authors +
                ", book category: " + bookCategory + "\n";
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

    public String getAuthors() {
        return authors;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
