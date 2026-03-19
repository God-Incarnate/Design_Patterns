package creational_patterns.factory_method.simple_factory;

import DTO.EMAILNotification;
import DTO.Notification;
import DTO.SMSNotification;
import DTO.WHATSAPPNotification;

/*
1️⃣ Simple Factory (Static Factory Method)

Technically not a GoF pattern, but widely used.

A single factory class decides which object to create based on input.

Structure
Client
  │
  ▼
NotificationFactory
  │
  ├── EmailNotification
  ├── SMSNotification
  └── WhatsAppNotification
 */
public class NotificationFactory {
    public static Notification createNotification(String key){
        return switch (key) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EMAILNotification();
            case "WHATSAPP" -> new WHATSAPPNotification();
            default -> throw new IllegalArgumentException();
        };
    }
}
