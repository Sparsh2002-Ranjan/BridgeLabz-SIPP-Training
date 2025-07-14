public class FirstNegativeFinder {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 0, -2, 9, -1};
        int result = findFirstNegative(numbers);
        System.out.println("Index of first negative number: " + result);
    }
}
