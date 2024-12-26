
public class fibonacci {
    public static void main(String[] args) {
        int s = 4;
        System.out.println(getFibo(s));

    }

    static int getFibo(int n) {
        if (n < 2) {
            return n;
        }
        return getFibo(n - 1) + getFibo(n - 2);
    }
}
