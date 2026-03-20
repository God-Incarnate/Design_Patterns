package behavioral_patterns.strategy_pattern;

public class UPIPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid " + amount + " using UPI");
    }
}
