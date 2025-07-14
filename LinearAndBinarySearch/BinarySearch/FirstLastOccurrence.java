public class FirstLastOccurrence {
    public static int findFirst(int[] arr, int target) {
        int index = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }

    public static int findLast(int[] arr, int target) {
        int index = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println("First: " + findFirst(nums, target));
        System.out.println("Last: " + findLast(nums, target));
    }
}
