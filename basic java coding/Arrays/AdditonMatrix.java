import java.util.Scanner;

class AdditionMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] sumArr = new int[m][n];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix:");
        printMatrix(arr1);
        System.out.println("Second Matrix:");
        printMatrix(arr2);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of Matrices:");
        printMatrix(sumArr);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}