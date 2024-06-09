import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { -9, 12, 90, 89, 45, -8 };
        sortArray(arr, arr.length);
        System.out.println("sorted array");
        System.err.println(Arrays.toString(arr));
    }

    /**
     * This method sorts an array using the bubble sort algorithm.
     * 
     * @param arr the array to sort
     * @param n   the length of the array
     */
    static void sortArray(int arr[], int n) {
        if (n == 1) {
            // If the array has only one element, it's already sorted
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // If the current element is greater than the next element, swap them
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        if (count == 0) {
            // If no swaps were made, the array is already sorted
            return;
        }
        sortArray(arr, n - 1); // recursively call the function with a smaller array
    }
}