package CreationalDesignPatterns.Factory.Notifications;

public class SlackNotification implements Notification {

    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Slack Notification is sent with message as follows " + message);
    }

}
