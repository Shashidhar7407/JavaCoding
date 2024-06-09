package recursion;

public class Reverse_Number_Method2 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(getReverseNumber(n));
    }

    /**
     * This method reverses a number using recursion.
     * 
     * @param n the input number
     * @return the reversed number
     */
    static int getReverseNumber(int n) {
        return getReverseHelper(n, 0);
    }

    /**
     * This method is a helper method for getReverseNumber. It recursively reverses
     * the number.
     * 
     * @param n              the input number
     * @param Reverse_Number the reversed number so far
     * @return the fully reversed number
     */
    private static int getReverseHelper(int n, int Reverse_Number) {
        if (n == 0) {
            // Base case: if the number is 0, return the reversed number
            return Reverse_Number;
        } else {
            // Recursive case: get the last digit of the number, add it to the reversed
            // number, and recursively call the method with the remaining digits
            int digit = n % 10;
            Reverse_Number = Reverse_Number * 10 + digit;
            return getReverseHelper(n / 10, Reverse_Number);
        }
    }
}