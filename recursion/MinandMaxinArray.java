package recursion;

public class MinandMaxinArray {
    public static void main(String[] args) {
        int[] arr = { 1, 45, -90, 32, 76 };
        System.out.println(getmaxinArray(arr, arr.length));
        System.out.println(getmininArray(arr, arr.length));
    }

    static int getmininArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];

        }
        return Math.min(arr[n - 1], getmininArray(arr, n - 1)); // recursion call for min here we are executing the code
                                                                // and getting the min valee
    }

    static int getmaxinArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], getmaxinArray(arr, n - 1)); // recursion call for max
    }
}
