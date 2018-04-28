package programowaniezaaw;

public class Category {

    private int numberC;

    private String nameC;

    private int number2C;

    public Category(int numberC, String nameC,  int number2C) {
        this.numberC = numberC;
        this.nameC = nameC;
        this.number2C = number2C;
    }

    @Override
    public String toString() {
        return "General number: " + numberC +
                ", name is: " + nameC +
                ", category number is: " + number2C + ";\n";
    }
}
