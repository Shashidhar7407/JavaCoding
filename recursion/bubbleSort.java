import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { -9, 12, 90, 89, 45, -8 };
        sortArray(arr, arr.length);
        System.out.println("sorted array");
        System.err.println(Arrays.toString(arr));
    }

    static void sortArray(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        if (count == 0) {
            return;
        }
        sortArray(arr, n - 1);

    }

}
