package creational_patterns.prototype.registry_pattern;

import DTO.EMAILNotification;
import DTO.Notification;
import DTO.SMSNotification;

import java.util.HashMap;
import java.util.Map;

/*
3️⃣ Prototype Registry Pattern

Instead of cloning from a single object, we maintain a registry of prototypes.

Architecture:

PrototypeRegistry
       │
 ┌───────────────┬───────────────┐
 ▼               ▼               ▼
EmailPrototype   SMSPrototype   WhatsAppPrototype

Very common in framework-level object creation.
 */
public class NotificationRegistry {

    private static Map<String, Notification> registry =
            new HashMap<>();

    static {

        registry.put("EMAIL", new EMAILNotification());
        registry.put("SMS", new SMSNotification());
    }

    public static Notification getClone(String type)
            throws CloneNotSupportedException {

        return (Notification) registry.get(type).clone();
    }
}
