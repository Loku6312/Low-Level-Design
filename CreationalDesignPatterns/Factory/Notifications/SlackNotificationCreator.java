package CreationalDesignPatterns.Factory.Notifications;

public class SlackNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new SlackNotification();
    }

}
