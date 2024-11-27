public interface Mediator {
    void sendMessage(String message, String sender, String recipient);
    void addClient(String username, ChatClientController client);
}