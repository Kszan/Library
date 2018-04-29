package programowaniezaaw;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class BooksReader {

    public void booksReader() {

        String source = "books.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        mainStringBuilder(br);

    }

    static void mainStringBuilder(BufferedReader br) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            StringBuilder sb = new StringBuilder();
            assert br != null;
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] attributes = line.split(";");
                Book book = createBook(attributes);
                books.add(book);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BookData.getInstance().setBooks(books);
    }

    private static Book createBook(String[] attributes) {
        return new Book(attributes[0], attributes[1], parseInt(attributes[2]));
    }
}

