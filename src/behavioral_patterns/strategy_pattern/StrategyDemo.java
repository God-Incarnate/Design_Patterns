package behavioral_patterns.strategy_pattern;

/*
1️⃣ What is the Strategy Pattern?

The Strategy Pattern is a Behavioral Design Pattern that allows you to define a family of algorithms, encapsulate each one in a separate class, and make them interchangeable at runtime.

In simple terms:

Strategy Pattern allows the algorithm used by a class to be selected at runtime.

Instead of writing large if–else or switch statements, we create separate strategy classes.

2️⃣ Problem Without Strategy Pattern

Imagine a Payment System that supports multiple payment methods.

Without Strategy Pattern:

class PaymentService {

    public void pay(String type, int amount) {

        if(type.equals("CREDIT_CARD")) {
            System.out.println("Paid using credit card");
        }
        else if(type.equals("PAYPAL")) {
            System.out.println("Paid using PayPal");
        }
        else if(type.equals("UPI")) {
            System.out.println("Paid using UPI");
        }
    }
}

Problems:

Issue	Explanation
Code becomes long	Many if-else conditions
Hard to maintain	Adding new payment types modifies code
Violates Open/Closed Principle	Existing code must change
3️⃣ Strategy Pattern Solution

We move each algorithm into separate classes.

Structure:

PaymentService → Strategy Interface → Concrete Strategies

Example:

PaymentStrategy
     |
---------------------------
|            |             |
CreditCard   PayPal       UPI
Strategy     Strategy     Strategy

Now algorithms are interchangeable.

4️⃣ Structure of Strategy Pattern

General structure:

Client → Context → Strategy
                |
        --------------------
        |                  |
ConcreteStrategy1   ConcreteStrategy2

Explanation:

Component	Role
Strategy	Interface for algorithms
ConcreteStrategy	Actual algorithm implementations
Context	Uses strategy
Client	Selects strategy
5️⃣ Key Idea

Instead of writing:

if (condition)
    algorithm1
else
    algorithm2

We write:

strategy.execute()

And choose the strategy dynamically.
 */
public class StrategyDemo {
    static void main(String[] args){
        PaymentService payment=new PaymentService();
        payment.setStrategy(new PayPalPayment());
        payment.pay(100);

        payment.setStrategy(new CreditCardPayment());
        payment.pay(500);

        payment.setStrategy(new UPIPayment());
        payment.pay(1000);
    }
}
/*
1️⃣1️⃣ Execution Flow

Step 1

Client selects strategy:

payment.setStrategy(new CreditCardPayment());

Step 2

Context calls strategy:

strategy.pay(amount);

Step 3

Specific algorithm runs.

Output:

Paid 1000 using Credit Card
Paid 500 using PayPal
Paid 200 using UPI
1️⃣2️⃣ Visual Flow
Client
  |
PaymentService (Context)
  |
PaymentStrategy
  |
---------------------------
|            |            |
CreditCard   PayPal       UPI
Strategy     Strategy     Strategy
1️⃣3️⃣ Runtime Algorithm Selection

Key advantage:

You can change algorithms at runtime.

Example:

payment.setStrategy(new PayPalPayment());
payment.pay(100);

Later:

payment.setStrategy(new CreditCardPayment());
payment.pay(100);

Same object, different behavior.
 */
