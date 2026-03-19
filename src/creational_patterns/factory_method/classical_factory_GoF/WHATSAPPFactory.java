package creational_patterns.factory_method.classical_factory_GoF;

import DTO.Notification;
import DTO.WHATSAPPNotification;

public class WHATSAPPFactory extends NotificationCreator{
    public Notification createNotification() {
        return new WHATSAPPNotification();
    }
}
