package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class frequncyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[] arr = { 5, 10, 20, 35, 5, 50, 20, 100, 200, 10, 150, 100, 100, 20, 20 };
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add((Integer) arr[i]);
        }
        count = Collections.frequency(arrList, num);
        System.out.println(count);
    }

}
