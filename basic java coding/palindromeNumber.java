public class palindromeNumber {
    public static void main(String[] args) {
        int x = 12345;
        int remainder, sum = 0, temp;
        temp = x;
        while (x > 0) {
            remainder = x % 10;
            sum = (sum * 10) + remainder;
            x = x / 10;
        }
        if (temp == sum) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("The Number is not a Palindrome");
            System.out.println("shashi");

        }
    }
}