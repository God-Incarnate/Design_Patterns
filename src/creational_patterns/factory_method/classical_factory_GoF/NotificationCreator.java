package creational_patterns.factory_method.classical_factory_GoF;

import DTO.Notification;

/*
2️⃣ Classical Factory Method Pattern (GoF)

Here the factory itself is abstract, and subclasses decide what object to create.

Structure
NotificationCreator (abstract)
       │
       ▼
 createNotification()

       │
 ┌───────────────┬───────────────┐
 ▼               ▼               ▼
EmailFactory   SMSFactory   WhatsAppFactory

NotificationCreator creator = new EmailFactory();

creator.sendNotification("Hello World");
 */
public abstract class NotificationCreator {

    public abstract Notification createNotification();

    public void sendNotification(String message) {

        Notification notification = createNotification();

        notification.send(message);
    }
}
