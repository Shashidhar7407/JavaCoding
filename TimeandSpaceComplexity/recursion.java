package TimeandSpaceComplexity;

public class recursion {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(getNfibo(n));

    }

    static int getNfibo(int n) {
        if (n < 2) {
            return n;
        }
        return getNfibo(n - 1) + getNfibo(n - 2);
    }

}
