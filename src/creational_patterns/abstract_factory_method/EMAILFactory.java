package creational_patterns.abstract_factory_method;


import DTO.EMAILNotification;
import DTO.Notification;
import creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF.EMAILFormatter;
import creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF.Formatter;

public class EMAILFactory implements NotificationAbstractFactory {

    public Notification createNotification() {
        return new EMAILNotification();
    }

    public Formatter createFormatter() {
        return new EMAILFormatter();
    }
}
