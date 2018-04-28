package programowaniezaaw;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        BooksReader booksReader = new BooksReader();
        booksReader.booksReader();
        AuthorsReader authorsReader = new AuthorsReader();
        CategoriesReader categoriesReader = new CategoriesReader();

        List<String> menuList = new ArrayList<>();
        menuList.add("Contact");
        menuList.add("Books");
        menuList.add("SelectBook");
        menuList.add("Authors");
        menuList.add("Categories");
        menuList.add("Close");
        Scanner scnm = new Scanner(System.in);
        myMenuList(menuList);
        int menuNumber = scnm.nextInt();
        int loopNumber = 1;
        while (loopNumber != 5) {
            switch(menuNumber) {
                case 1:
                    System.out.println("Contact us via email: jakisemail@gmail.com\n");
                    break;
                case 2:
                    System.out.println(BookData.getInstance().getBooks());
                    break;
                case 3:
                    ArrayList<Book> books = BookData.getInstance().getBooks();
//                    for (Book book : books) {
//                        if(book.getYear() < 2005) {
//                            System.out.println(book);
//                        }
//                    }
                    books.stream().filter(p -> p.getYear() < 2005).forEach(System.out::println);
                    break;
                case 4:
                    authorsReader.authorsReader();
                    break;
                case 5:
                    categoriesReader.categoriesReader();
                    break;
                case 6:
                    System.out.println("Close");
                    break;
                    default:
                        System.out.println("Wrong number");
            }
            myMenuList(menuList);
            menuNumber = scnm.nextInt();
            loopNumber = menuNumber;
        }
    }

    private static void myMenuList(List<String> menuList) {
        System.out.println("Please check the menu options and chose one: ");
        System.out.println("1. " + menuList.get(0));
        System.out.println("\t2. " + menuList.get(1));
        System.out.println("\t\t3. " + menuList.get(2));
        System.out.println("\t\t\t4. " + menuList.get(3));
        System.out.println("\t\t\t\t5. " + menuList.get(4));
        System.out.println("\t\t\t\t\t5. " + menuList.get(5));
    }
}