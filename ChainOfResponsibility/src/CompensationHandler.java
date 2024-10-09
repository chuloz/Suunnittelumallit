

// CompensationHandler.java
public class CompensationHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (canHandle(message)) {
            System.out.println("Processing compensation claim: " + message.getContent());
            // Compensation claim logic
        } else {
            super.handle(message);
        }
    }

    @Override
    protected boolean canHandle(Message message) {
        return message.getType().equals(Message.getCompensationClaimType());
    }
}
