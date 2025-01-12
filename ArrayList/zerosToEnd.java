import java.util.*;

class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 0, 6, 7, 9, 0, 89 };
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != 0) {
                arrList.add((Integer) arr[idx]);
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == 0) {
                arrList.add((Integer) arr[idx]);
            }

        }
        System.out.println(arrList);

    }
}