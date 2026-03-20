package structural_patterns.facade_pattern;

import DTO.EMAILNotification;
import DTO.SMSNotification;

public class NotificationFacade {
    private EMAILNotification email=new EMAILNotification();
    private SMSNotification sms=new SMSNotification();

    public void sendNotification(String message){
        email.send(message);
        sms.send(message);
    }
}
