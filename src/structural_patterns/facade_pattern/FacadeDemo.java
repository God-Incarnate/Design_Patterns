package structural_patterns.facade_pattern;

/*
1️⃣ What is the Facade Pattern?

The Facade Pattern is a Structural Design Pattern that provides a simple interface to a complex system.

In simple words:

Facade acts as a single entry point that hides the complexity of multiple subsystems.

Instead of the client interacting with many classes, it interacts with one simplified class (Facade).

2️⃣ Real-Life Analogy
🎬 Movie Theater Example

To watch a movie at home you need:

Turn on TV
Turn on Sound System
Turn on Streaming Device
Set HDMI Input
Start Movie

If the user has to manually control everything, it's complex.

Instead, we create a Facade class:

MovieFacade.watchMovie()

This internally performs:

turnOnTV()
turnOnSoundSystem()
setInput()
startMovie()

User just calls one method.

3️⃣ Problem Without Facade

Suppose the client wants to send notifications through multiple services.

Without facade:

EmailService email = new EmailService();
SMSService sms = new SMSService();

email.sendEmail("Hello");
sms.sendSMS("Hello");

Problems:

Client must know all subsystem classes

Client handles execution order

Client code becomes tightly coupled

4️⃣ Solution With Facade

Create a Facade class that hides subsystem complexity.

Client now does:

NotificationFacade facade = new NotificationFacade();
facade.sendNotification("Hello");

Simple and clean.

5️⃣ Structure of Facade Pattern
Client → Facade → Subsystem Classes

More detailed view:

Client
   |
Facade
   |
-----------------------
|         |           |
SubsystemA SubsystemB SubsystemC
6️⃣ Components of the Facade Pattern

There are three main parts.

Component	Role
Client	Uses the facade
Facade	Simplified interface
Subsystems	Actual complex logic
 */
public class FacadeDemo {
    static void main(String[] args){
        NotificationFacade facade=new NotificationFacade();

        facade.sendNotification("hello");
    }
}
/*
1️⃣1️⃣ Execution Flow

Step 1

Client calls:

facade.sendNotification("Hello User")

Step 2

Facade internally calls:

EmailService.sendEmail()

Step 3

Facade calls:

SMSService.sendSMS()
1️⃣2️⃣ Output
Email sent: Hello User
SMS sent: Hello User
1️⃣3️⃣ Visual Flow
Client
  |
NotificationFacade
  |
-----------------------
|                     |
EmailService      SMSService
1️⃣4️⃣ Why Facade Is Useful

Imagine a banking system.

To transfer money, many operations are required:

Check account
Validate balance
Deduct amount
Add amount
Send notification
Log transaction

Without facade:

Client must call all services manually.

With facade:

BankFacade.transferMoney()

Facade internally handles everything.
 */