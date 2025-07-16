public class CountingSortStudentAges {
    public static void countingSort(int[] arr, int maxAge) {
        int[] count = new int[maxAge + 1];
        for (int age : arr)
            count[age]++;
        int index = 0;
        for (int i = 0; i <= maxAge; i++) {
            while (count[i]-- > 0)
                arr[index++] = i;
        }
    }

    public static void main(String[] args) {
        int[] ages = {13, 17, 12, 10, 15, 13, 14};
        countingSort(ages, 18);
        for (int age : ages)
            System.out.print(age + " ");
    }
}
