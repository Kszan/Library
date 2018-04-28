package programowaniezaaw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class AuthorsReader {
    public void authorsReader() {

        String source = "authors.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        AuthorsReader.mainStringBuilderA(br);
    }


    static void mainStringBuilderA(BufferedReader br) {
        ArrayList<Author> authors = new ArrayList<>();

        try {
            StringBuilder sb = new StringBuilder();
            assert br != null;
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] attributes = line.split(";");
                Author author = createAuthor(attributes);
                authors.add(author);
                line = br.readLine();
            }
            System.out.print(authors);
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

    private static Author createAuthor(String[] attributes) {
        return new Author(parseInt(attributes[0]), (attributes[1]), parseInt(attributes[2]));
    }
}


