package creational_patterns.abstract_factory_method;

import DTO.Notification;
import DTO.SMSNotification;
import creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF.Formatter;
import creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF.SMSFormatter;

public class SMSFactory implements NotificationAbstractFactory {

    public Notification createNotification() {
        return new SMSNotification();
    }

    public Formatter createFormatter() {
        return new SMSFormatter();
    }
}
