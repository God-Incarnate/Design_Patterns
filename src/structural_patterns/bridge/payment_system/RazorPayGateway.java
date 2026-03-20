package structural_patterns.bridge.payment_system;

public class RazorPayGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Payment processing by RAZORPAY Gateway: "+amount);
    }
}
