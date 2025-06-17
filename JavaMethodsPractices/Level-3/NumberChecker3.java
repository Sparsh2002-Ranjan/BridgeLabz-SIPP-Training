import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = getDigitCount(number);
        int[] digits = getDigitsArray(number, count);
        int[] reversed = reverseDigitsArray(digits);

        System.out.println("Digit Count: " + count);
        System.out.println("Original Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome? " + (isPalindrome(digits, reversed) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number, int count) {
        int[] digits = new int[count];
        int i = count - 1;
        while (number > 0) {
            digits[i--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysAreEqual(int[] a1, int[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] original, int[] reversed) {
        return arraysAreEqual(original, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
