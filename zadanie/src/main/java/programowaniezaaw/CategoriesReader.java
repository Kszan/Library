package programowaniezaaw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CategoriesReader {
    public void categoriesReader() {

        String source = "categories.csv";

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(source)));
        CategoriesReader.mainStringBuilderC(br);
    }

    static void mainStringBuilderC(BufferedReader br) {
        ArrayList<Category> categories = new ArrayList<>();

        try {
            StringBuilder sb = new StringBuilder();
            assert br != null;
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] attributes = line.split(";");
                Category category = createCategory(attributes);
                categories.add(category);
                line = br.readLine();
            }
            System.out.print(categories);
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

    private static Category createCategory(String[] attributes) {
        return new Category(parseInt(attributes[0]), (attributes[1]), parseInt(attributes[2]));
    }
}

