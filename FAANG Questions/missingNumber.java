import java.util.Arrays;

public class MissingNumber {

    public static int missingNumberArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int indexValue = 0; indexValue < arr.length; indexValue++) {
            if (arr[indexValue] != indexValue) {
                return indexValue;
            }
        }

        return arr.length;
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 1};
        int missingNumber = missingNumberArray(arr);
        System.out.println("Missing Number: " + missingNumber);
    }
}
