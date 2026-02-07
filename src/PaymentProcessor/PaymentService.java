package PaymentProcessor;

class PaymentService {

    private PaymentStrategy strategy;


    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(double amount) {
        strategy.pay(amount);
    }
}