import java.util.Scanner;

class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
 * 1 2 3
 * 4 5 6
 */