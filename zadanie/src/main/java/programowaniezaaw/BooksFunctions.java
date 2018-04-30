package programowaniezaaw;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BooksFunctions {
    //1
    public Book findBookByISBN(List<Book> books) {
        Book collect = books.stream().filter(book -> book.getIsbn().equals("0321146530")).findFirst().get();
        return collect;
    }

    //2
    public List<Book> sortByYear(List<Book> books) {
        List<Book> sorter = books.stream().sorted((book, t1) -> Integer.compare(book.getYear(), t1.getYear())).collect(Collectors.toList());
        return sorter;
    }

    //3
    public List<Book> lastTwoBooks(List<Book> books) {
        List<Book> lastBook = books.stream().skip(books.size() - 2).collect(Collectors.toList());
        return lastBook;
    }

    //4
    public List<Book> sortByYearAtLast(List<Book> books) {
        List<Book> sorterLast = books.stream().sorted((book, t1) -> Integer.compare(t1.getYear(), book.getYear())).collect(Collectors.toList());
        return sorterLast;
    }

    //5
    public Book showFirstBookByYear(List<Book> books, int year) {
        return books.stream().sorted(Comparator.comparing(Book::getYear)).findFirst().get();
    }

    //6
    public Book showLastBookYear(List<Book> books, int year) {
        return books.stream().sorted(Comparator.comparing(Book::getYear).reversed()).findFirst().get();
    }

    //7
    public int sumOFYears(List<Book> books) {
        return books.stream().mapToInt(Book::getYear).sum();
    }

    //8
    public int afterYear(List<Book> books) {
        return (int) books.stream().filter(book -> book.getYear() > 2007).count();
    }

    //9
    public long booksAfter2000(List<Book> books) {
        return books.stream().filter(book -> book.getYear() > 2000).count();
    }

    //10
    public int averageYearOfBooks(List<Book> books) {
        return books.stream().mapToInt(Book::getYear).sum() / books.size();
    }

    //11
    public long booksBefore2000(List<Book> books) {
        return books.stream().filter(book -> book.getYear() < 2000).count();
    }

    //13
    public List<Book> afterYearAndWithT(List<Book> books) {
        return books.stream().filter(s -> s.getNameB().startsWith("T")).filter(book -> book.getYear() > 2009).collect(Collectors.toList());
    }

    //14
    public List<Book> adding100ToTheYear(List<Book> books) {
        books.stream().forEach(book -> book.setYear(book.getYear() + 100));
        return books;
    }
    //15
    public List<Book> booksModulo(List<Book> books) {
        return books.stream().filter(book -> book.getYear() % 2 == 0).collect(Collectors.toList());
    }
}
