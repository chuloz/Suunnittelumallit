import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<String, String> accessList;

    private AccessControlService() {
        accessList = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void addAccess(String documentId, String username) {
        accessList.put(documentId, username);
    }

    public boolean isAllowed(String documentId, String username) {
        return accessList.getOrDefault(documentId, "").equals(username);
    }
}
