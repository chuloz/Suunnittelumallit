import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, DocumentInterface> documents = new HashMap<>();

    public void addDocument(String identifier, DocumentInterface document) {
        documents.put(identifier, document);
    }

    public DocumentInterface getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void addProtectedDocument(String identifier, Date creationDate, String allowedUser) {
        DocumentProxy proxy = new DocumentProxy(identifier, creationDate);
        AccessControlService.getInstance().addAccess(identifier, allowedUser);
        addDocument(identifier, proxy);
    }

    public void addUnprotectedDocument(String identifier, Date creationDate, String content) {
        Document document = new Document(identifier, creationDate, content);
        addDocument(identifier, document);
    }
}
