package example2;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new PushNotificationSender();
        Notification n = new Notification("You are in danger!");
        sender.send(n);
    }
}
