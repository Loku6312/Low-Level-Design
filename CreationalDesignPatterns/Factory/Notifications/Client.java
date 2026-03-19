package CreationalDesignPatterns.Factory.Notifications;

public class Client {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("welcoem to our platform", "EMAIL");
        service.sendNotification("FROM SMS WELCOME", "SMS");
        service.sendNotification("FROM SLACK WELCOME", "SLACK");
    }
}
