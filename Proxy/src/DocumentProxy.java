import java.util.Date;

public class DocumentProxy implements DocumentInterface {
    private Document realDocument;
    private String identifier;
    private Date creationDate;
    private AccessControlService accessControl;

    public DocumentProxy(String identifier, Date creationDate) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.accessControl = AccessControlService.getInstance();
    }

    private void createRealDocument(String content) {
        if (realDocument == null) {
            realDocument = new Document(identifier, creationDate, content);
        }
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControl.isAllowed(identifier, user.getUsername())) {
            createRealDocument("This is the protected content of the document.");
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
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
