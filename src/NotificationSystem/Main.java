package NotificationSystem;

public class Main {

    public static void main(String[] args) {
        // we should be able to switch between sending users msgs via sms or email

        MessageService sms = new SMSService();
        MessageService email = new EmailService();

        NotificationService notify = new NotificationService(email);

        notify.registerUser();
    }
}
