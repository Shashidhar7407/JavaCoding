package recursionArrays;

public class CheckingSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9, 12, 2 };
        checkSortedMethod1(arr);
        boolean result = checkSortedMethod2(arr, 0);
        System.out.println(result);

    }

    public static boolean checkSortedMethod2(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && checkSortedMethod2(arr, index + 1);

    }

    public static void checkSortedMethod1(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }

    }
}