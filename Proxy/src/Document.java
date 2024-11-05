import java.util.Date;

public class Document implements DocumentInterface {
    private String identifier;
    private Date creationDate;
    private String content;

    public Document(String identifier, Date creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
