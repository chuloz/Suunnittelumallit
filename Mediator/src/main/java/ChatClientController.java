
import javafx.scene.control.TextArea;

public class ChatClientController {
    private String username;
    private ChatMediator mediator;
    private TextArea chatArea;

    public ChatClientController(String username, ChatMediator mediator, TextArea chatArea) {
        this.username = username;
        this.mediator = mediator;
        this.chatArea = chatArea;
        mediator.addClient(username, this);
    }

    public void sendMessage(String message, String recipient) {
        chatArea.appendText("Me to " + recipient + ": " + message + "\n");
        mediator.sendMessage(message, username, recipient);
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }
}