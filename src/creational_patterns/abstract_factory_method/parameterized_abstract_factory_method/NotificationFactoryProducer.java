package creational_patterns.abstract_factory_method.parameterized_abstract_factory_method;

import creational_patterns.abstract_factory_method.EMAILFactory;
import creational_patterns.abstract_factory_method.NotificationAbstractFactory;
import creational_patterns.abstract_factory_method.SMSFactory;

/*
2️⃣ Parameterized Abstract Factory

Here the factory is selected using parameters.

Usage::::::::::::::::::::::::::
NotificationAbstractFactory factory =
        NotificationFactoryProducer.getFactory("EMAIL");
 */
public class NotificationFactoryProducer {

    public static NotificationAbstractFactory getFactory(String type) {

        if(type.equalsIgnoreCase("EMAIL"))
            return new EMAILFactory();

        if(type.equalsIgnoreCase("SMS"))
            return new SMSFactory();

        throw new IllegalArgumentException("Invalid type");
    }
}
