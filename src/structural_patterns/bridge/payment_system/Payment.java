package structural_patterns.bridge.payment_system;

abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway){
        this.gateway=gateway;
    }
    abstract void makePayment(double amount);
}
