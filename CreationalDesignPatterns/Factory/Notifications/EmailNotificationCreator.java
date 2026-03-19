package CreationalDesignPatterns.Factory.Notifications;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new EmailNotification();
    }

}
