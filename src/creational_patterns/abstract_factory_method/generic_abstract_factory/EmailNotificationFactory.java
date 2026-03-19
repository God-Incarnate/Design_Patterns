package creational_patterns.abstract_factory_method.generic_abstract_factory;

import DTO.EMAILNotification;
import DTO.Notification;


public class EmailNotificationFactory
        implements AbstractFactory<Notification> {

    public Notification create() {
        return new EMAILNotification();
    }
}
