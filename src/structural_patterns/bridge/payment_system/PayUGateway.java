package structural_patterns.bridge.payment_system;

public class PayUGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Payment processing by PayU Gateway: "+amount);
    }
}
