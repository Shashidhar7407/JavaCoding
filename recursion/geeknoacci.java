import java.util.Scanner;

public class geeknoacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int testCases = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < testCases; i++) {
            // Read A, B, C, and N for each test case
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int N = scanner.nextInt();

            // Calculate the Nth geek-onacci number for the current test case
            int result = getGeekOnacci(A, B, C, N);

            // Print the result
            System.out.println(result);
        }

        scanner.close();
    }

    // Recursive method to calculate geek-onacci number
    public static int getGeekOnacci(int A, int B, int C, int N) {
        if (N == 1) {
            return A;
        } else if (N == 2) {
            return B;
        } else if (N == 3) {
            return C;
        } else {
            // Recursively calculate the Nth geek-onacci number
            return getGeekOnacci(A, B, C, N - 1) +
                    getGeekOnacci(A, B, C, N - 2) +
                    getGeekOnacci(A, B, C, N - 3);
        }
    }
}
