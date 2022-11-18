package example3;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void send(Notification notification) {
        //Типа логика отправки пуша
        System.out.println("Sent via push");
    }
}
