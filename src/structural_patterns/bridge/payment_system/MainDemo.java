package structural_patterns.bridge.payment_system;

/*
The Bridge Pattern is often confusing at first because it looks similar to Strategy or Adapter, but its real purpose is:

To separate abstraction from implementation so both can evolve independently.

Instead of creating many subclasses for every combination, Bridge splits the system into two independent hierarchies.

Why Bridge Pattern is Needed

Imagine you are building a Payment System.

You support:

Payment Types

Credit Card

UPI

Wallet

and

Payment Gateways

Razorpay

Stripe

PayPal

If you don't use Bridge, you may end up with:

CreditCardStripe
CreditCardRazorpay
CreditCardPayPal
UPIStripe
UPIRazorpay
UPIPayPal
WalletStripe
WalletRazorpay
WalletPayPal

That becomes N × M classes.

Bridge solves this by separating:

Payment Type
        |
        v
   Payment Gateway
Bridge Pattern Structure
Abstraction
    |
    v
Refined Abstraction
    |
    v
Implementation Interface
    |
    v
Concrete Implementations
 */
public class MainDemo {
    static void main(String[] args){
        PaymentGateway razorPay= new RazorPayGateway();
        Payment payment=new CreditCardPayment(razorPay);
        payment.makePayment(1000);
    }
}
/*
Output
Credit card used to initiate payment for amount: 1000
Payment processing by RAZORPAY Gateway:  1000
 */