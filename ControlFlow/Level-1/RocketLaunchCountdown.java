import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Liftoff!");
    }
}
