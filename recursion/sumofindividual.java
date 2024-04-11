public class sumofindividual {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(getindividualsum(num));
    }

    static int getindividualsum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10 + getindividualsum(n / 10));
        }
    }

}
