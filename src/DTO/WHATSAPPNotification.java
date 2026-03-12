package DTO;

public class WHATSAPPNotification implements Notification {
    public void send(String msg){
        System.out.println("WHATSAPP sent: "+msg);
    }
}
