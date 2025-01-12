package Patterns;

import java.util.Scanner;

public class HollowHalf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == num || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// *
// * *
// * *
// * *
// * *
// * *
// * * * * * * *

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == num || j == i) {
                    System.out.print(j + " ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}