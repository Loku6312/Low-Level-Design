package CreationalDesignPatterns.Factory.Notifications;

public abstract class NotificationCreator {

    public abstract Notification createNotification();

    public void send(String message) {
        Notification notifier = createNotification();
        notifier.send(message);
    }

}
