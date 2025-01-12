
import java.util.Scanner;

public class randomStringChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "Shashidhar Papishetty going to new world";
        String[] words = input.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                String rev = reverseString(words[i]);
                result += rev + " ";
            } else {
                result += words[i] + " ";
            }
        }
        System.out.println(result);
    }

    public static String reverseString(String name) {
        String rev = "";
        for (int i = 0; i < name.length(); i++) {
            rev = name.charAt(i) + rev;
        }
        return rev;

    }

}
