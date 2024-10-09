

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler compensationHandler = new CompensationHandler();
        Handler contactRequestHandler = new ContactReqestHandler();
        Handler developmentSuggestionHandler = new DevSuggestionHandler();
        Handler generalFeedbackHandler = new FeedbackHandler();

        // Chain handlers
        compensationHandler.setNext(contactRequestHandler);
        contactRequestHandler.setNext(developmentSuggestionHandler);
        developmentSuggestionHandler.setNext(generalFeedbackHandler);

        // Create sample messages
        Message message1 = new Message(Message.getCompensationClaimType(), "Claim delayed delivered ", "x@gmail.com");
        Message message2 = new Message(Message.getContactRequestType(), "Need information about a product", "y@gmail.com");
        Message message3 = new Message(Message.getDevelopmentSuggestionType(), "Add another payment method", "z@gmail.com");
        Message message4 = new Message(Message.getGeneralFeedbackType(), "Great customer service!", "v@gmail.com");

        // Send messages through the handler chain
        compensationHandler.handle(message1);
        compensationHandler.handle(message2);
        compensationHandler.handle(message3);
        compensationHandler.handle(message4);
    }
}