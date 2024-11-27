import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements Mediator {
    private Map<String, ChatClientController> clients = new HashMap<>();

    @Override
    public void addClient(String username, ChatClientController client) {
        clients.put(username, client);
    }

    @Override
    public void sendMessage(String message, String sender, String recipient) {
        if (clients.containsKey(recipient)) {
            clients.get(recipient).receiveMessage(sender, message);
        } else {
            System.out.println("Recipient not found: " + recipient);
        }
    }
}