
public class largestNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 600, 1, 3, 9, 7, 15, 101 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
