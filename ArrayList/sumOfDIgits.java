import java.util.Scanner;

public class sumOfDIgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(getSumOfAllTheDigits(value));
    }

    static int getSumOfAllTheDigits(int value) {
        int sum = 0;
        int reaminder;
        while (value > 0) {
            reaminder = value % 10;
            sum = sum + reaminder;
            value /= 10;
        }

        return sum;
    }

}
