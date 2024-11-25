import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation cloned = (Recommendation) super.clone();
            cloned.books = new ArrayList<>();
            for (Book book : books) {
                cloned.books.add(book.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Target Audience: " + targetAudience + "\nBooks:\n");
        for (Book book : books) {
            sb.append("- ").append(book).append("\n");
        }
        return sb.toString();
    }
}