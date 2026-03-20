package structural_patterns.bridge.payment_system;

public class CreditCardPayment extends Payment{
    public CreditCardPayment(PaymentGateway gateway){
        super(gateway);
    }
    public void makePayment(double amount){
        System.out.println("Credit card used to initiate payment for amount: "+amount);
        gateway.processPayment(amount);
    }
}
