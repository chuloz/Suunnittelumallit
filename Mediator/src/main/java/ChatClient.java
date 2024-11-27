import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClient extends Application {
    private ChatMediator mediator = new ChatMediator();

    @Override
    public void start(Stage primaryStage) {
        createChatWindow("Ismo");
        createChatWindow("Aku");
        createChatWindow("Mohlo");
    }

    private void createChatWindow(String username) {
        Stage stage = new Stage();
        stage.setTitle(username);

        TextArea chatArea = new TextArea();
        chatArea.setEditable(false);

        TextField messageField = new TextField();
        TextField recipientField = new TextField();
        recipientField.setPromptText("Recipient");

        Button sendButton = new Button("Send");

        ChatClientController controller = new ChatClientController(username, mediator, chatArea);

        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            String recipient = recipientField.getText();
            if (!message.isEmpty() && !recipient.isEmpty()) {
                controller.sendMessage(message, recipient);
                messageField.clear();
            }
        });

        VBox layout = new VBox(10, chatArea, recipientField, messageField, sendButton);
        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }


}