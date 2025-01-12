package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 10, 20, 35, 5, 50, 20, 100, 200, 10, 150, 100, 100 };
        int num = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add((Integer) arr[i]);
        }
        for (int j = arrList.size() - 1; j >= 0; j--) {
            if (arrList.get(j) == num) {
                arrList.remove(j);
            }
        }
        System.out.println(arrList);
    }

}
