package behavioral_patterns.mediator_pattern;

/*
6️⃣ Mediator Pattern
1️⃣ Purpose

The Mediator Pattern is a behavioral design pattern that reduces direct communication between objects.

Instead of objects talking directly to each other, they communicate through a central mediator object.

Core Idea
ObjectA → Mediator → ObjectB
ObjectC → Mediator → ObjectD

Objects do not know about each other.
They only know the Mediator.

2️⃣ Problem Without Mediator

Imagine a chat application with multiple users.

If users communicate directly:

User1 → User2
User1 → User3
User1 → User4
User2 → User3
User2 → User4
User3 → User4

Connections grow rapidly.

With 5 users
5 × 4 = 20 connections

This creates:

Problem	Explanation
Tight coupling	Objects depend on many others
Complex communication	Too many interactions
Hard to maintain	Adding new objects requires updates

This situation is called spaghetti communication.

3️⃣ Mediator Pattern Solution

Introduce a Mediator.

All objects communicate through it.

       Mediator
      /   |   \
    U1   U2   U3

Now communication becomes:

User → Mediator → User

Objects become loosely coupled.

4️⃣ Real-World Analogy
✈️ Air Traffic Control

Planes do not communicate with each other directly.

Instead:

Plane → Air Traffic Controller → Plane

The controller acts as the mediator.

Responsibilities:

manage takeoffs

avoid collisions

coordinate planes

5️⃣ Structure of Mediator Pattern

General structure:

Client
  |
Mediator Interface
  |
ConcreteMediator
  |
-------------------------
|           |           |
ColleagueA  ColleagueB  ColleagueC
6️⃣ Components of Mediator Pattern
Component	Role
Mediator	Interface defining communication
ConcreteMediator	Implements coordination
Colleague	Objects that communicate
Client	Creates mediator and colleagues
 */
public class MediatorDemo {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        User user1 = new ChatUser(mediator,"Prashant");
        User user2 = new ChatUser(mediator,"Rahul");
        User user3 = new ChatUser(mediator,"Amit");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone");
    }
}
/*
1️⃣2️⃣ Execution Flow

Step 1 — User sends message

User1 → mediator.sendMessage()

Step 2 — Mediator receives message

Mediator distributes message

Step 3 — Other users receive it

User2 receives message
User3 receives message
1️⃣3️⃣ Output
Prashant sends: Hello everyone
Rahul receives: Hello everyone
Amit receives: Hello everyone
1️⃣4️⃣ Visual Flow
       ChatMediator
        /   |   \
   User1  User2  User3
      |
   sendMessage()

Mediator handles communication.

1️⃣5️⃣ Real-World Use Cases
1️⃣ Chat Systems

Example:

User → Chat Server → Other Users

Chat server is the mediator.
 */
