package Patterns;

import java.util.Scanner;

class HollowInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || i == 1 || j == num - i + 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
 * 1 2 3 4 5 6 7
 * 1 6
 * 1 5
 * 1 4
 * 1 3
 * 1 2
 * 1
 */