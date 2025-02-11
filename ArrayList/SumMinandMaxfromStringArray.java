import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumMinandMaxfromStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] stringArray = input.toCharArray();
        getExtractDigits(stringArray);

    }

    static void getExtractDigits(char[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(arr[i])) {
                Integer value = Character.getNumericValue(arr[i]);
                arrList.add(value);
                sum += (int) value;
            } else {
                continue;
            }
        }
        Collections.sort(arrList);
        int size = arrList.size();
        System.out.println(sum);
        System.out.println(arrList.get(0));
        System.out.println(arrList.get(size - 1));
    }

}
