package programowaniezaaw;

class Book {

    private String nameB;

    private String isbn;

    private int year;

    public Book(String nameB, String isbn, int year) {
        this.nameB = nameB;
        this.isbn = isbn;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book name is: " + nameB +
                ", isbn is: " + isbn +
                ", year is: " + year + ";\n";
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


}
