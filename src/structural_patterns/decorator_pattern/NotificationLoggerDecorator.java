package structural_patterns.decorator_pattern;

import DTO.Notification;

public class NotificationLoggerDecorator extends NotificationDecorator{
    public NotificationLoggerDecorator(Notification notification){
        super(notification);
    }

    public void send(String msg){
        System.out.println("Logger Message");
        super.send(msg);
    }
}
