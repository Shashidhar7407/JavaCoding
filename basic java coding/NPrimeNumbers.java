import java.util.Scanner;

class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        // Loop through all numbers from 2 to N
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
