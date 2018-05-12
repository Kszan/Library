package programowaniezaaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class SaveAuthorsToFile {
    public void saveBooksIntoTheFile(List<Book> books) {

        System.out.println("Your changes are now saving....");
        String url = "books.csv";
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("src/main/resources/" + "a" + url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getNameB()).append(";");
            sb.append(book.getIsbn()).append(";");
            sb.append(book.getYear()).append(";");
            if (book.getBinding() == BindingType.HARDCOVER) {
                sb.append("H").append(";");
            } else if (book.getBinding() == BindingType.SOFT_BINDING) {
                sb.append("M").append(";");
            } else {
                sb.append("").append(";");
            }
            for (int i = 0; i <= book.getAuthors().size()-1; i++) {
                sb.append(book.getAuthors().get(i).getIdA()).append(";");
            }
            sb.append(book.getBookCategory()).append("\n");
        }
        pw.write(sb.toString());
        pw.close();
    }
}
