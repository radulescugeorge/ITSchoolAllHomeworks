package dip;

/**
 * Refactor the NotificationService to depend on an abstraction.
 * Implement a new notifier for SMS without changing NotificationService.
 */


public class Main {

    public static void main(String[] args) {
        NotificationService ns = new NotificationService("My Message.");
        ns.sendEmail();
        ns.sendSMS();

    }
}