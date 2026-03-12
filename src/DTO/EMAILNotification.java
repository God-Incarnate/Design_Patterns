package DTO;

public class EMAILNotification implements Notification {
    public void send(String msg){
        System.out.println("EMAIL sent: "+msg);
    }
}
