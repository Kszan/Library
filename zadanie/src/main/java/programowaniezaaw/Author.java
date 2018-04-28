package programowaniezaaw;

public class Author {
    private int numberA;

    private String nameA;

    private int number2A;

    public Author( int numberA, String nameA, int number2A) {
        this.numberA = numberA;
        this.nameA = nameA;
        this.number2A = number2A;
    }

    @Override
    public String toString() {
        return "General number: " + numberA +
                ", author name is: " + nameA +
                ", author number is: " + number2A + ";\n";
    }
}
