package creational_patterns.factory_method.factory_method_dependency_injection;

import DTO.EMAILNotification;
import DTO.Notification;
import DTO.SMSNotification;
import DTO.WHATSAPPNotification;

/*
Application
   │
Spring Container
   │
   ├ emailNotification()
   ├ smsNotification()
   └ whatsappNotification()
 */
@Configuration
public class NotificationFactory {
    @Bean
    public Notification smsNotification(){
        return new SMSNotification();
    }

    @Bean
    public Notification emailNotification(){
        return new EMAILNotification();
    }

    @Bean
    public Notification whatsAppNotification(){
        return new WHATSAPPNotification();
    }
}
