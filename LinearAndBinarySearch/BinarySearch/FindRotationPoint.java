public class FindRotationPoint {
    public static int findRotationIndex(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // or return arr[left] if you want the element
    }

    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        int index = findRotationIndex(nums);
        System.out.println("Rotation index: " + index);
    }
}
