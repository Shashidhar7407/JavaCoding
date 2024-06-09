package bitwise;

// This program checks if a number is odd or even using bitwise operations

public class Bitwise {
    public static void main(String[] args) {
        // 2(pow)0 ==1 then it's one then it's an odd number
        int n = 68;
        System.out.println(isOdd(n)); // prints "false" because 68 is even
    }

    /**
     * This method checks if a number is odd using bitwise AND operation.
     * In binary representation, odd numbers always have 1 as the least significant
     * bit (LSB).
     * So, if we perform a bitwise AND operation with 1, it will return 1 if the
     * number is odd, otherwise 0.
     * 
     * @param n the number to check
     * @return true if the number is odd, false otherwise
     */
    public static boolean isOdd(int n) {
        return (n & 1) == 1; // bitwise AND operation with 1
    }
}