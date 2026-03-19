package creational_patterns.abstract_factory_method;

import DTO.Notification;
import creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF.Formatter;

/*
Usage:::::::::::::::::
        -------------------------------------------------------------
        public class NotificationService {

            private Notification notification;
            private Formatter formatter;

            public NotificationService(NotificationAbstractFactory factory) {

                notification = factory.createNotification();
                formatter = factory.createFormatter();
            }

            public void send(String message) {

                String formatted = formatter.format(message);

                notification.send(formatted);
            }
        }
        ---------------------------------------------------------

1️⃣ Classical Abstract Factory (GoF Pattern)

This is the standard implementation described in the Gang of Four book.

Structure
AbstractFactory
     │
     ├ createNotification()
     ├ createValidator()
     └ createFormatter()

        ▲
        │
 ┌───────────────┬───────────────┐
 ▼               ▼
EmailFactory     SMSFactory
 */
public interface NotificationAbstractFactory {

    Notification createNotification();

    Formatter createFormatter();
}
