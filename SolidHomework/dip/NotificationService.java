package dip;

public class NotificationService implements EmailNotifier, SMSNotifier {
    private String message;

    public NotificationService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void sendEmail() {
        System.out.println("Email sent: " + this.getMessage());
    }

    @Override
    public void sendSMS() {
        System.out.println("SMS sent : " + this.getMessage());
    }
}