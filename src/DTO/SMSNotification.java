package DTO;

public class SMSNotification implements Notification {
    public void send(String msg){
        System.out.println("SMS sent: "+msg);
    }
}
