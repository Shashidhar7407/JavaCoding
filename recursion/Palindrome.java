package recursion;

public class Palindrome {
    public static void main(String[] args) {

        int n = 12345432;

        System.out.println(checkPalindrome(n));

    }

    private static boolean checkPalindrome(int n) {
        int remainder = 0;
        int newDigit = 0;
        int original_number = n;
        if (n == 0) {
            return true;
        } else {

            while (n > 0) {
                remainder = n % 10;
                newDigit = newDigit * 10 + remainder;
                n = n / 10;

            }
        }
        return original_number == newDigit;

    }

}
