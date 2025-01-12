package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

}

/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
 */