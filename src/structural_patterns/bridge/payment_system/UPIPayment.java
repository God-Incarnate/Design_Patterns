package structural_patterns.bridge.payment_system;

public class UPIPayment extends Payment{
    public UPIPayment(PaymentGateway gateway){
        super(gateway);
    }
    public void makePayment(double amount){
        System.out.println("UPI mode selected for payment of amount: "+amount);
        gateway.processPayment(amount);
    }
}
