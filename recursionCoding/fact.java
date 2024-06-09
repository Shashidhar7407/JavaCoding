public class fact {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(getfact(n));

    }

    static int getfact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return getfact(n - 1) * n;
        }

    }

}
