package creational_patterns.factory_method.classical_factory_GoF;

import DTO.EMAILNotification;
import DTO.Notification;

public class EMAILFactory extends NotificationCreator{
    public Notification createNotification(){
        return new EMAILNotification();
    }
}
