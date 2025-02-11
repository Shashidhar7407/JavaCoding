
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 8, 7, 6, 78 };
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }

}
