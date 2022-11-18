package example3;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(Notification notification) {
        //Типа отправка имейла
        System.out.println("email sent");
    }
}
