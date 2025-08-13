import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        Predicate<Double> highTempAlert = temp -> temp > 30.0;
        double currentTemp = 32.5;
        if (highTempAlert.test(currentTemp)) {
            System.out.println("Alert: Temperature is too high!");
        }
    }
}