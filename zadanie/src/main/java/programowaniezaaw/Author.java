package programowaniezaaw;

public class Author {
    private String idA;

    private String nameA;

    private int age;

    public Author( String idA, String nameA, int age) {
        this.idA = idA;
        this.nameA = nameA;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Id: " + idA +
                ", author name is: " + nameA +
                ", author age is: " + age + ";\n";
    }

    public String getIdA() {
        return idA;
    }
}
