package structural_patterns.decorator_pattern;

import DTO.EMAILNotification;
import DTO.Notification;

/*
1️⃣ What is the Decorator Pattern?

The Decorator Pattern is a Structural Design Pattern that allows you to add new behavior to objects dynamically at runtime without modifying their original class.

In simple terms:

Instead of modifying an existing class, you wrap the object with another object that adds new functionality.

Think of it like wrapping a gift 🎁
Each wrapper adds something new, but the original gift remains unchanged.

2️⃣ Why Do We Need the Decorator Pattern?

Imagine you have a Notification System.

Base notification:

Send Email

Now new requirements appear:

Send Email + Logging
Send Email + SMS
Send Email + Logging + Encryption
Send Email + SMS + Logging

If we create separate classes for each combination, we get class explosion.

Example of bad design:

EmailNotification
EmailNotificationWithLogging
EmailNotificationWithSMS
EmailNotificationWithLoggingAndSMS
EmailNotificationWithEncryption

This quickly becomes unmanageable.

Decorator Pattern solves this by stacking behaviors dynamically.

3️⃣ Core Idea of Decorator Pattern

Instead of creating many subclasses, we wrap objects with decorators.

Structure:

EmailNotification
      |
LoggingDecorator
      |
EncryptionDecorator
      |
SMSDecorator

Each decorator adds new behavior.

4️⃣ Structure of Decorator Pattern
        Component
            |
    -------------------
    |                 |
ConcreteComponent   Decorator
                        |
                ConcreteDecorator

Explanation:

Part	Role
Component	Common interface
ConcreteComponent	Original object
Decorator	Base wrapper
ConcreteDecorator	Adds new behavior
 */
public class DecoratorDemo {
    static void main(String[] args){
        Notification notification=new NotificationLoggerDecorator(new EMAILNotification());
        notification.send("Hello");
    }
}
/*
1️⃣1️⃣ Execution Flow

Step 1

notification.send("Hello")

calls:

LoggingDecorator.send()

Step 2

LoggingDecorator prints:
Logging message

Step 3

super.send(message)

calls:

EmailNotification.send()

Step 4

Email sent: Hello

Final Output:

Logging message
Email sent: Hello
1️⃣2️⃣ Visual Flow
Client
   |
LoggingDecorator
   |
EmailNotification

Execution:

LoggingDecorator.send()
      |
      v
EmailNotification.send()
1️⃣3️⃣ Powerful Feature — Multiple Decorators

Decorator Pattern allows stacking decorators.

Example:

Notification notification =
        new SMSDecorator(
            new LoggingDecorator(
                new EmailNotification()));

Structure:

SMSDecorator
     |
LoggingDecorator
     |
EmailNotification

Execution order:

SMS
Logging
Email
1️⃣4️⃣ Real-World Example: Coffee Shop ☕

This example is famous in design pattern books.

Base object:

Coffee

Decorators:

Milk
Sugar
Whipped Cream
Chocolate
 */