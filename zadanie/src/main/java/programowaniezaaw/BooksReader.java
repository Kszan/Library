package programowaniezaaw;

import java.io.*;

public class BooksReader {

    public void booksReader() {

        String source = "books.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        mainStringBuilder(br);
    }

    static void mainStringBuilder(BufferedReader br) {
        try {
            StringBuilder sb = new StringBuilder();
            assert br != null;
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

