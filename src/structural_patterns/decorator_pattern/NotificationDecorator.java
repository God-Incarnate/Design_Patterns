package structural_patterns.decorator_pattern;

import DTO.Notification;

public class NotificationDecorator implements Notification {
    private Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification=notification;
    }

    public void send(String msg){
        notification.send(msg);
    }
}
