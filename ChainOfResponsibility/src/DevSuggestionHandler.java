

// DevelopmentSuggestionHandler.java
public class DevSuggestionHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (canHandle(message)) {
            System.out.println("Logging development suggestion: " + message.getContent());
            // Development suggestion logic
        } else {
            super.handle(message);
        }
    }

    @Override
    protected boolean canHandle(Message message) {
        return message.getType().equals(Message.getDevelopmentSuggestionType());
    }
}