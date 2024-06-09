package recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 102030340;
        getCountZero(n);
        getCountZeroMethod2(n);

    }

    public static void getCountZeroMethod2(int n) {
        int remainder = 0;
        int count = 0;
        if (n < 0) {
            System.out.println("-1");
        } else {
            while (n > 0) {
                remainder = n % 10;
                if (remainder == 0) {
                    count++;
                }
                n = n / 10;
            }
            System.out.println(count);
        }
    }

    private static void getCountZero(int n) {
        String number;
        char[] ch;
        int count = 0;
        if (n < 0) {
            System.out.println("-1");
        } else {
            number = Integer.toString(n);
            System.out.println(number);
            ch = number.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '0') {
                    count = count + 1;
                } else {
                    continue;
                }
            }
            System.out.println(count);

        }

    }

}
