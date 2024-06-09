package recursion;

import Strings.prettyPrinting;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getfactorial(n));
    }

    public static int getfactorial(int n) {
        if (n <= 2) {
            return n;
        } else {
            return n * getfactorial(n - 1);
        }

    }

}
