package CreationalDesignPatterns.Factory.Notifications;

public class SMSNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new SMSNotification();
    }

}
