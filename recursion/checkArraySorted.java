public class checkArraySorted {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 9, 3, 4, 5 };
        int n = arr.length;
        if (checkArrayisSorted(arr, n) != 0) {

            System.out.println("The array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }

    static int checkArrayisSorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return 0;
        }

        return checkArrayisSorted(arr, n - 1);
    }

}
