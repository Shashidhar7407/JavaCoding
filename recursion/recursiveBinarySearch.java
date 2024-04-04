package recursion;

public class recursiveBinarySearch {
    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    static int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
            return binarySearch(nums, start, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, end, target);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        System.out.println(search(arr, target));
    }
}
