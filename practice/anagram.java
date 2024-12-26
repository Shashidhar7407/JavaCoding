
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "Listen";
        String str2 = "Silents";

        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charString1 = str2.toCharArray();
        char[] charString2 = str.toCharArray();

        Arrays.sort(charString2);
        Arrays.sort(charString1);

        if (Arrays.equals(charString1, charString2)) {
            System.out.println("anangram");
        } else {
            System.out.println("not an anagram");
        }

    }

}
