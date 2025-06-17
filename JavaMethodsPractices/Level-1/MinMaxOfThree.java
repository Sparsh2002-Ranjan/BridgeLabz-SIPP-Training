import java.util.Scanner;
public class MinMaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        findMinAndMax(a, b, c);
    }
    public static void findMinAndMax(int a, int b, int c) {
        int smallest = a;
        int largest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }
}
