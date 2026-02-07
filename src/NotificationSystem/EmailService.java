package NotificationSystem;

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}
