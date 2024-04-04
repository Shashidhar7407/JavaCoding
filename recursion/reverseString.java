package recursion;

import java.util.*;

public class reverseString {
    public static void reverseStringConvert(char[] s) {
        if (s.length <= 1) {
            return;
        }
        reverseStrings(s, 0, s.length - 1);

    }

    static void reverseStrings(char[] s, int left, int right) {
        if (left >= right) {
            return;
        } else {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            reverseStrings(s, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseStringConvert(s);
        System.out.println(Arrays.toString(s));
    }
}
