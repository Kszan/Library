package programowaniezaaw;

import java.util.List;
import java.util.stream.Collectors;

public class BooksFunctions{
    //1
    public Book findBookByISBN(List<Book> books) {
        Book collect = books.stream().filter(book -> book.getIsbn().equals("0321146530")).findFirst().get();
        return collect;
    }
    //2
    public List<Book> sortByYear(List<Book> books) {
        List<Book> sorter = books.stream().sorted((book, t1) ->Integer.compare(book.getYear(), t1.getYear())).collect(Collectors.toList());
        return sorter;
    }
    //3
    public Book lastTwoBooks(List<Book> books) {

        return null;
    }
    //4
    public Book sortByYearAtLast(List<Book> books) {

        return null;
    }
    //5
    public Book showFirstBookByYear(List<Book> books) {

        return null;
    }
    //6
    public Book showLastBookByYear(List<Book> books) {

        return null;
    }
}
