package NotificationSystem;

class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService service) {
        this.messageService = service;
    }

    public void registerUser() {
        messageService.sendMessage("Welcome to this App");
    }

}
