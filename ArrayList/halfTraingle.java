package ArrayList;

import java.util.*;

class halfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list1.add(arr[i][j]);
            }
            System.out.println(list1);
        }
        sc.close();
    }
}