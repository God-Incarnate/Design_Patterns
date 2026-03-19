package creational_patterns.builder_patterns.classical_builder_pattern_GoF;

/*
Usage:::::::::::::::::::::::
public class NotificationDirector {

    public Notification construct(NotificationBuilder builder) {

        builder.setMessage("Hello");
        builder.setRecipient("User");
        builder.setPriority("HIGH");

        return builder.build();
    }
}
 */
public class EmailNotificationBuilder implements NotificationBuilder {

    private Notification notification = new Notification();

    public void setMessage(String message) {
        notification.setMessage(message);
    }

    public void setRecipient(String recipient) {
        notification.setRecipient(recipient);
    }

    public void setPriority(String priority) {
        notification.setPriority(priority);
    }

    public Notification build() {
        return notification;
    }
}
