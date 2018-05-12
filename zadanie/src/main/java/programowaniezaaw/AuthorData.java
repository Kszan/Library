package programowaniezaaw;

import java.util.ArrayList;
import java.util.List;

public class AuthorData {
    ArrayList<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    private static AuthorData instance = new AuthorData();

    private AuthorData() {}

    public static AuthorData getInstance() {
        return instance;
    }

    public List<Author> getAuthorById(String[] id) {
        List<Author> list = new ArrayList<>();
        for (String s : id) {
            list.add(authors.stream().filter(author -> author.getIdA().equals(s)).findFirst().get());
        }
        return list;
    }

}
