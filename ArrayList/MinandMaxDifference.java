import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinandMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] intArray = sc.nextLine().split(",");
        System.out.println(getDifferenceMaxAndMin(intArray));

    }

    static int getDifferenceMaxAndMin(String[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            Integer value = Integer.parseInt(arr[i]);
            arrList.add(value);
        }
        Collections.sort(arrList);
        int min = (int) arrList.get(0);
        int max = (int) arrList.get(length - 1);
        return max - min;
    }

}
