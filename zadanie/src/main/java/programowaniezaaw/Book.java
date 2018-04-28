package programowaniezaaw;

class Book {

    private String nameB;

    private int isbn;

    private int year;

    public Book(String nameB, int isbn, int year) {
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
}
