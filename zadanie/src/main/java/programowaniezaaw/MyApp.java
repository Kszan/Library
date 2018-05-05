package programowaniezaaw;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyApp {
    public static void main(String[] args) {
        BooksReader booksReader = new BooksReader();
        booksReader.booksReader();
        AuthorsReader authorsReader = new AuthorsReader();
        CategoriesReader categoriesReader = new CategoriesReader();
        BooksFunctions booksFunctions = new BooksFunctions();
        BookPrinter bookPrinter;

        List<String> menuList = new ArrayList<>();
        menuList.add("Contact");
        menuList.add("Books");
        menuList.add("Books year first");
        menuList.add("Books title first");
        menuList.add("Books isbn first");
        menuList.add("Books before 2005");
        menuList.add("Authors");
        menuList.add("Categories");
        menuList.add("Sort after year");
        menuList.add("Reverse after year");
        menuList.add("Books after 2003");
        menuList.add("Close");
        Scanner scnm = new Scanner(System.in);
        myMenuList(menuList);
        int menuNumber = scnm.nextInt();
        int loopNumber = 1;
        BookData bookData = BookData.getInstance();
        while (loopNumber != 12) {
            switch(menuNumber) {
                case 1:
                    System.out.println("Contact us via email: jakisemail@gmail.com\n");
                    break;
                case 2:
                    System.out.println(BookData.getInstance().getBooks());
                    break;
                case 3:
                    bookPrinter = new BookPrinter(new YearFirstStrategy());
                    bookPrinter.showBooks(bookData.getBooks());
                    break;
                case 4:
                    bookPrinter = new BookPrinter(new TitleFirstStrategy());
                    bookPrinter.showBooks(bookData.getBooks());
                    break;
                case 5:
                    bookPrinter = new BookPrinter(new IsbnFirstStrategy());
                    bookPrinter.showBooks(bookData.getBooks());
                    break;
                case 6:
                    ArrayList<Book> books = bookData.getBooks();
                    books.stream().filter(p -> p.getYear() < 2005).forEach(System.out::println);
                    break;
                case 7:
                    authorsReader.authorsReader();
                    break;
                case 8:
                    categoriesReader.categoriesReader();
                    break;
                case 9:
                    System.out.println(booksFunctions.sortByYear(bookData.getBooks()));
                    break;
                case 10:
                    System.out.println(booksFunctions.sortByYearAtLast(bookData.getBooks()));
                    break;
                case 11:
                    System.out.println(booksFunctions.booksAfter2003(bookData.getBooks()));
                    break;
                case 12:
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
        System.out.println("\t\t\t\t\t6. " + menuList.get(5));
        System.out.println("\t\t\t\t\t\t7. " + menuList.get(6));
        System.out.println("\t\t\t\t\t\t\t8. " + menuList.get(7));
        System.out.println("\t\t\t\t\t\t\t\t9. " + menuList.get(8));
        System.out.println("\t\t\t\t\t\t\t\t\t10. " + menuList.get(9));
        System.out.println("\t\t\t\t\t\t\t\t\t\t11. " + menuList.get(10));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t12. " + menuList.get(11));

    }
}