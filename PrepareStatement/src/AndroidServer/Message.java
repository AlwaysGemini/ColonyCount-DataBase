package AndroidServer;

public class Message implements java.io.Serializable {
    
	private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}