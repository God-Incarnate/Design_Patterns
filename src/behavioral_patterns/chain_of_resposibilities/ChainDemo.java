package behavioral_patterns.chain_of_resposibilities;

/*
4️⃣ Chain of Responsibility Pattern
1️⃣ Purpose

The Chain of Responsibility Pattern is a behavioral design pattern that allows a request to be passed along a chain of handlers until one of them handles it.

Instead of the client deciding which object should process the request, the request moves through multiple objects.

Each handler decides:

Process the request

Pass it to the next handler

Core Idea
Client → Handler1 → Handler2 → Handler3 → Handler4
                     ↑
                One handler processes request
2️⃣ Why This Pattern Is Used

Without this pattern, we might write code like:

if(level == "LOW")
    handleByLowManager();
else if(level == "MEDIUM")
    handleByManager();
else if(level == "HIGH")
    handleByDirector();

Problems:

Problem	Explanation
Tight coupling	Client knows all handlers
Hard to extend	Adding new handler modifies existing code
Large condition blocks	Too many if-else statements

The Chain of Responsibility Pattern removes these issues.

3️⃣ Real-World Analogy
📄 Office Approval System

Imagine a leave approval system.

Request goes through hierarchy:

Employee Leave Request
      ↓
Team Lead
      ↓
Manager
      ↓
Director

Rules:

Team Lead approves ≤ 2 days

Manager approves ≤ 5 days

Director approves > 5 days

Each handler either:

Approves request

Forwards to next authority

4️⃣ Structure of Chain of Responsibility

General structure:

Client
   |
Handler (abstract)
   |
--------------------------
|           |            |
HandlerA   HandlerB    HandlerC

Request flows through handlers until one handles it.

5️⃣ Components of the Pattern
Component	Role
Handler	Abstract class defining handler interface
ConcreteHandler	Processes request
Client	Sends request
Next Handler	Next object in chain
 */
public class ChainDemo {

    public static void main(String[] args) {

        Handler low = new LowLevelHandler();
        Handler mid = new MidLevelHandler();
        Handler high = new HighLevelHandler();

        low.setNextHandler(mid);
        mid.setNextHandler(high);

        low.handleRequest(5);
        low.handleRequest(15);
        low.handleRequest(25);
    }
}

/*
9️⃣ Execution Flow
Request = 5
LowLevelHandler handles it
Request = 15
LowLevelHandler → MidLevelHandler handles
Request = 25
LowLevelHandler → MidLevelHandler → HighLevelHandler handles
🔟 Output
LowLevelHandler handled request: 5
MidLevelHandler handled request: 15
HighLevelHandler handled request: 25
1️⃣1️⃣ Visual Flow
Client
  |
LowLevelHandler
  |
MidLevelHandler
  |
HighLevelHandler

Request travels along the chain.

1️⃣2️⃣ Real-World Use Cases
1️⃣ Logging Frameworks

Logging levels:

DEBUG → INFO → WARNING → ERROR

Each logger decides whether to process the message.

2️⃣ Middleware Pipelines

Example:

HTTP Request
   ↓
Authentication
   ↓
Authorization
   ↓
Validation
   ↓
Controller

Used heavily in:

web frameworks

API gateways
 */
