package creational_patterns.factory_method.registry_based_factory;

import DTO.EMAILNotification;
import DTO.Notification;
import DTO.SMSNotification;
import DTO.WHATSAPPNotification;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/*
4️⃣ Registry-Based Factory (Advanced Production Pattern)

Used in plugin systems and frameworks.

Objects are registered in a map.

Notification n =
        NotificationFactory.createNotification("SMS");

n.send("Hello");
 */
public class NotificationFactory {
    private static Map<String, Supplier<Notification>> registry= new HashMap<>();

    static{
        registry.put("EMAIL", EMAILNotification::new);
        registry.put("SMS", SMSNotification::new);
        registry.put("WHATSAPP", WHATSAPPNotification::new);
    }

    public static Notification createNotification(String type){
        Supplier<Notification> supplier=registry.get(type);
        if(supplier==null){
            throw new IllegalArgumentException();
        }
        return supplier.get();
    }
}
