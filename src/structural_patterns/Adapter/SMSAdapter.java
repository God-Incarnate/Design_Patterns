package structural_patterns.Adapter;

import DTO.Notification;
import DTO.SMSNotification;

/*
1️⃣ Adapter Pattern
Purpose

The Adapter Pattern allows classes with incompatible interfaces to work together.

It acts as a wrapper that converts one interface into another expected by the client.

Real-World Analogy:::::::::::::

A phone charger adapter converts:

220V Socket → 5V USB

Structure::::::::::::
Client → Target Interface → Adapter → Adaptee

Usage:::::::::::::::::::
public class AdapterDemo {

    public static void main(String[] args) {

        LegacySMSService legacy = new LegacySMSService();

        NotificationService service =
                new SMSAdapter(legacy);

        service.send("Hello");
    }
}
 */
class SMSAdapter implements Notification {

    private SMSNotification smsService;

    public SMSAdapter(SMSNotification smsService) {
        this.smsService = smsService;
    }

    public void send(String message) {
        smsService.send(message);
    }
}
