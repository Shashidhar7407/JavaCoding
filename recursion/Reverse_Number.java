package recursion;

public class Reverse_Number {

    static int reverseDigit = 0;

    public static void getReverseNumber(int n) {
        if (n == 0) {
            return;
        } else {
            int rem = n % 10;
            reverseDigit = reverseDigit * 10 + rem;
            getReverseNumber(n / 10);

        }
    }

    public static void main(String[] args) {
        int n = 12345;
        getReverseNumber(n);
        System.out.println(reverseDigit);

    }

}
