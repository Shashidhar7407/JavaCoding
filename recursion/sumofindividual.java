package recursion;

public class sumofindividual {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(getindividualsum(num));
    }

    /**
     * This method calculates the sum of individual digits of a number using
     * recursion.
     * 
     * @param n the input number
     * @return the sum of individual digits of the number
     */
    static int getindividualsum(int n) {
        if (n == 0) {
            // Base case: if the number is 0, return 0
            return 0;
        } else {
            // Recursive case: return the last digit of the number plus the sum of the
            // remaining digits
            return (n % 10 + getindividualsum(n / 10));
        }
    }

}