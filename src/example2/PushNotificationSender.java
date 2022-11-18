package example2;

public class PushNotificationSender extends NotificationSender{
    @Override
    public void send(Notification notification) {
        //Типа логика отправки пуша
        System.out.println("Sent via push");
    }
}
