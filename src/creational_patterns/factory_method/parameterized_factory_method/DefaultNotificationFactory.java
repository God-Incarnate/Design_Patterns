package creational_patterns.factory_method.parameterized_factory_method;

import DTO.EMAILNotification;
import DTO.Notification;
import DTO.SMSNotification;
import DTO.WHATSAPPNotification;
/*
3️⃣ Parameterized Factory Method

Here the factory method takes parameters to decide which object to create.
 */
public class DefaultNotificationFactory extends NotificationFactory{
    public Notification createNotification(String type){
        return switch (type) {
            case "EMAIL" -> new EMAILNotification();
            case "SMS" -> new SMSNotification();
            case "WHATSAPP" -> new WHATSAPPNotification();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    };
}
