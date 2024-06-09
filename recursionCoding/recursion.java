public class recursion {
    public static void main(String[] args) {
        int n = 5;
        recufunc(n);
    }

    static void recufunc(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        recufunc(n - 1);

        System.out.println(n);

    }
}
