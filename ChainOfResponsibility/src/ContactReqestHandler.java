

// ContactRequestHandler.java
public class ContactReqestHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (canHandle(message)) {
            System.out.println("Forwarding contact request: " + message.getContent());
            // Contact request logic
        } else {
            super.handle(message);
        }
    }

    @Override
    protected boolean canHandle(Message message) {
        return message.getType().equals(Message.getContactRequestType());
    }
}