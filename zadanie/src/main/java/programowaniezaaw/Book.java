package programowaniezaaw;

class Book {

    private String nameB;

    private String isbn;

    private int year;

    private BindingType binding;

    public Book(String nameB, String isbn, int year, BindingType binding) {
        this.nameB = nameB;
        this.isbn = isbn;
        this.year = year;
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book name is: " + nameB +
                ", isbn is: " + isbn +
                ", year is: " + year +
                ", binding type: " + binding + "\n";
    }

    public BindingType getBinding() {
        return binding;
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

    public void setYear(int year) {
        this.year = year;
    }
}
