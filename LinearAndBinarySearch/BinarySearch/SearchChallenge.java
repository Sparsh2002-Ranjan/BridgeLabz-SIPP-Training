import java.util.Arrays;
import java.util.HashSet;

public class SearchChallenge {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (n > 0) set.add(n);
        }

        int i = 1;
        while (true) {
            if (!set.contains(i)) return i;
            i++;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        System.out.println("First missing positive: " + firstMissingPositive(arr));
        System.out.println("Index of target after sorting: " + binarySearch(arr, target));
    }
}
