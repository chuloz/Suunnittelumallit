// Message.java
public class Message {
    private static final String COMPENSATION_CLAIM = "Compensation Claim";
    private static final String CONTACT_REQUEST = "Contact Request";
    private static final String DEVELOPMENT_SUGGESTION = "Development Suggestion";
    private static final String GENERAL_FEEDBACK = "General Feedback";

    private final String type;         // Type of the message
    private final String content;      // Content of the message
    private final String senderEmail;  // Sender's email

    public Message(String type, String content, String senderEmail) {
        this.type = type;
        this.content = content;
        this.senderEmail = senderEmail;
    }

    // Getters for the fields
    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    // Static methods to get predefined message types
    public static String getCompensationClaimType() {
        return COMPENSATION_CLAIM;
    }

    public static String getContactRequestType() {
        return CONTACT_REQUEST;
    }

    public static String getDevelopmentSuggestionType() {
        return DEVELOPMENT_SUGGESTION;
    }

    public static String getGeneralFeedbackType() {
        return GENERAL_FEEDBACK;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", senderEmail='" + senderEmail + '\'' +
                '}';
    }
}