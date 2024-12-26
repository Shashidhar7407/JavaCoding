public class palindrome {
    public static void main(String[] args) {
        int n = 1011;
        int temp = n, sum = 0, r;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;

        }

        if (temp == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
