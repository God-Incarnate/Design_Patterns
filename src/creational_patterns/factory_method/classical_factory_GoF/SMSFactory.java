package creational_patterns.factory_method.classical_factory_GoF;

import DTO.Notification;
import DTO.SMSNotification;

public class SMSFactory extends NotificationCreator{
    public Notification createNotification() {
        return new SMSNotification();
    }
}
