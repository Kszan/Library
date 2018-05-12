package programowaniezaaw;

import java.util.Scanner;

public class NewAuthor {
    public void getNewAuthorData(){
        Scanner scnValue1 = new Scanner(System.in);
        Scanner scnValue2 = new Scanner(System.in);
        Scanner scnValue3 = new Scanner(System.in);
        String idA = null;
        String nameA = null;
        int age = 0;

        System.out.print("Please input identifier: ");
        if (scnValue1.hasNextInt()) {
            idA = scnValue1.nextLine();
        } else {
            scnValue1.next();
            System.out.print("You try input wrong data!!!");
        }

        System.out.print("Please enter new Author name: ");
        if (scnValue2.hasNext()) {
            nameA = scnValue2.nextLine();
        } else {
            scnValue2.next();
            System.out.print("You try input wrong data!!!");
        }

        System.out.print("Please enter Author age: ");
        if (scnValue3.hasNextInt()) {
            age = scnValue3.nextInt();
        } else {
            scnValue3.next();
            System.out.print("You try input wrong data!!!");
        }

        System.out.println("Added new author with identifier: " + idA + ", name: " +
                nameA + ", age: " + age);

        AuthorData.getInstance().addAuthor(new Author(idA, nameA, age));
    }
}

