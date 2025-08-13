interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI"); }
}
class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card"); }
}
class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet"); }
}
public class Main {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay(500);
    }
}