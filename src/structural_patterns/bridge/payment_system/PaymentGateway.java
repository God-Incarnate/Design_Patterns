package structural_patterns.bridge.payment_system;

interface PaymentGateway {
    void processPayment(double amount);
}
