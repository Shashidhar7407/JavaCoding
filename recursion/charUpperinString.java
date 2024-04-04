package recursion;

public class charUpperinString {
    public static void main(String[] args) {
        String s = " geeks for geekS";
        System.out.println(findUpper(s, 0));

    }

    static char findUpper(String s, int i) {
        if (s.length() == 0 || (i >= s.length())) {
            return 0;
        }
        if (Character.isUpperCase(s.charAt(i))) {
            return s.charAt(i);

        } else {
            return findUpper(s, i + 1);
        }

    }

}
