package recursion;

public class Digit_Product {
    public static void main(String[] args) {
        int n = 78976570;
        System.out.println(getDigitproduct(n));
    }

    /**
     * This method calculates the product of individual digits of a number using
     * recursion.
     * 
     * @param n the input number
     * @return the product of individual digits of the number
     */
    public static int getDigitproduct(int n) {
        if (n <= 9) {
            // Base case: if the number is a single digit, return the number itself
            return n;
        } else {
            // Recursive case: return the product of the last digit of the number and the
            // product of the remaining digits
            return ((n % 10) * getDigitproduct(n / 10));
        }
    }
}