package creational_patterns.builder_patterns.classical_builder_pattern_GoF;

/*
1️⃣ Classical Builder Pattern (GoF)

This is the original design described by the Gang of Four.

It separates:

Object Construction
from
Object Representation

Structure:::::
Director
   │
Builder (interface)
   │
 ┌───────────────┬───────────────┐
 ▼               ▼
ConcreteBuilder1 ConcreteBuilder2
 */
public class Notification {

    private String message;
    private String recipient;
    private String priority;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String toString() {
        return message + " " + recipient + " " + priority;
    }
}
