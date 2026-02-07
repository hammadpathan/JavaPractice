package PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        // lets test out PaymentProcessor
        // the goal of this problem is to use open/closed principles
        // and learn polymorphism

        // scenario A - customer pays with paypal
        PaymentStrategy pp = new PayPalPayment();
        PaymentService service = new PaymentService(pp);

        service.processOrder(100.00);

        // scenario B - customer pays with creditcard
        PaymentStrategy cc = new CreditCardPayment();
        PaymentService service2 = new PaymentService(cc);

        service2.processOrder(100.00);
    }
}
