import java.util.*;

public class OddEvenPositionsChange {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 3, 2, 7, 5, 8, 10, 13, 17 };
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                arrList.add((Integer) numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                arrList.add((Integer) numbers[i]);
            }
        }
        System.out.println(arrList);

    }

}
