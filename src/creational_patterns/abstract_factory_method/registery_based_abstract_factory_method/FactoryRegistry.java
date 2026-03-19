package creational_patterns.abstract_factory_method.registery_based_abstract_factory_method;

import creational_patterns.abstract_factory_method.EMAILFactory;
import creational_patterns.abstract_factory_method.NotificationAbstractFactory;
import creational_patterns.abstract_factory_method.SMSFactory;

import java.util.HashMap;
import java.util.Map;

/*
3️⃣ Registry Based Abstract Factory

Used in plugin architectures.

Factories are stored in a Map registry.

Usage::::::::::::::::::
NotificationAbstractFactory factory =
        FactoryRegistry.getFactory("EMAIL");
 */
public class FactoryRegistry {

    private static Map<String, NotificationAbstractFactory> registry
            = new HashMap<>();

    static {

        registry.put("EMAIL", new EMAILFactory());
        registry.put("SMS", new SMSFactory());
    }

    public static NotificationAbstractFactory getFactory(String type) {

        return registry.get(type);
    }
}
