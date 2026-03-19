package creational_patterns.abstract_factory_method.generic_abstract_factory;

/*
Usage:::::::::::::::::::::
AbstractFactory<Notification> factory =
        new EmailNotificationFactory();

Notification notification = factory.create();

Java generics make factories type-safe.
 */
public interface AbstractFactory<T> {

    T create();
}
