package example3;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new EmailNotificationSender();
        Notification n = new Notification("You are in danger!");
        sender.send(n);
    }
}
