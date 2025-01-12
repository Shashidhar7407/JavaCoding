package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_sum_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < col; j++) {
                max = Math.max(max, arr[i][j]);
            }
            arrList.add(max);
        }
        System.out.println(arrList);
        arrList.clear();
        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                min = Math.min(min, arr[i][j]);
            }
            arrList.add(min);
        }
        System.out.println(arrList);
        arrList.clear();
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            arrList.add(sum);
        }
        System.out.println(arrList);
    }

}
