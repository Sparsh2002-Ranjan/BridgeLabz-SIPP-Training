import java.util.Scanner;
public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill calculation is only valid for temperatures <= 50°F and wind speed >= 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);
        }
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
