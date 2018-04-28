package programowaniezaaw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AuthorsReader {
    public void authorsReader() {

        String source = "authors.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        BooksReader.mainStringBuilder(br);
    }
}
