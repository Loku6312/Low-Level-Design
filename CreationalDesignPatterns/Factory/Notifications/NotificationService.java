package CreationalDesignPatterns.Factory.Notifications;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {

    private final Map<String, NotificationCreator> creatorRegistry = new HashMap<>();

    public NotificationService() {
        creatorRegistry.put("EMAIL", new EmailNotificationCreator());
        creatorRegistry.put("SMS", new SMSNotificationCreator());
        creatorRegistry.put("SLACK", new SlackNotificationCreator());
    }

    public void sendNotification(String message, String type) {
        NotificationCreator creator = creatorRegistry.get(type);
        if (creator == null) {
            throw new IllegalArgumentException("Unsupported Notification Type");
        }
        creator.send(message);

    }

}
