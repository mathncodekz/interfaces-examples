package example2;

public class EmailNotificationSender extends NotificationSender {

    @Override
    public void send(Notification notification) {
        //Типа отправка имейла
        System.out.println("email sent");
    }
}
