package creational_patterns.builder_patterns.classical_builder_pattern_GoF;

public interface NotificationBuilder {

    void setMessage(String message);

    void setRecipient(String recipient);

    void setPriority(String priority);

    Notification build();
}
