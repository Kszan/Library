package programowaniezaaw;

public class Category {

    private int idC;

    private String nameC;

    private int priorityC;

    public Category(int idC, String nameC,  int priorityC) {
        this.idC = idC;
        this.nameC = nameC;
        this.priorityC = priorityC;
    }

    @Override
    public String toString() {
        return "Id: " + idC +
                ", name is: " + nameC +
                ", priority number is: " + priorityC + ";\n";
    }
}
