package CreationalDesignPatterns.Factory.Notifications;

class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Email Notification sent with message as follows " + message);
    }

}
