package NotificationSystem;

class SMSService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("SMS: " + msg);
    }
}
