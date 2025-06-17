import java.util.Scanner;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = getDigitCount(number);
        int[] digits = getDigitsArray(number, count);

        System.out.println("Digit Count: " + count);
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

        int[][] freq = findDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " => " + freq[i][1] + " times");
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return number % digitSum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }
}
