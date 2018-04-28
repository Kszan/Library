package programowaniezaaw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CategoriesReader {
    public void categoriesReader() {

        String source = "categories.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        BooksReader.mainStringBuilder(br);
    }
}
