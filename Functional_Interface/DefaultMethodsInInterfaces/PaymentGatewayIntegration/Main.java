interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refunding amount: " + amount);
    }
}
class PayPal implements PaymentProcessor {
    public void processPayment(double amount) { System.out.println("Processing PayPal payment: " + amount); }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor pp = new PayPal();
        pp.processPayment(200);
        pp.refund(50);
    }
}