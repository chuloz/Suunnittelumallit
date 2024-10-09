

// Handler.java
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(Message message) {
        if (next != null) {
            next.handle(message);
        }
    }

    protected abstract boolean canHandle(Message message);
}