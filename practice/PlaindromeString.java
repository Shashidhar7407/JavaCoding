
public class PlaindromeString {
    public static void main(String[] args) {
        String name = "Madam";
        String rev = "";

        for (int i = 0; i < name.length(); i++) {
            rev = name.charAt(i) + rev;
        }

        if (name.equalsIgnoreCase(rev)) {
            System.out.println(name + " is a palindrome");

        } else {
            System.out.println("not a palindrome");
        }
    }

}
