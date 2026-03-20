package structural_patterns.Adapter;

import DTO.Notification;
import DTO.SMSNotification;


class SMSAdapter implements Notification {

    private SMSNotification smsService;

    public SMSAdapter(SMSNotification smsService) {
        this.smsService = smsService;
    }

    public void send(String message) {
        smsService.send(message);
    }
}
