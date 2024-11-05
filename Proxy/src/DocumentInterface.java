import java.util.Date;

public interface DocumentInterface {
    String getContent(User user) throws AccessDeniedException;
    Date getCreationDate();
    String getIdentifier();
}
