package creational_patterns.factory_method.parameterized_factory_method;

import DTO.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification(String type);
}
