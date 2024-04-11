public class removeDuplicatesinString {
    public static void main(String[] args) {
        String str = "aaabcccgeeksforgeeks";
        System.out.println(removeConsectiveDuplicates(str));

    }

    static String removeConsectiveDuplicates(String str) {
        if (str.length() <= 1) {
            return str;

        }
        if (str.charAt(0) == str.charAt(1)) {
            return removeConsectiveDuplicates(str.substring(1));

        } else {
            return str.charAt(0) + removeConsectiveDuplicates(str.substring(1));

        }

    }

}
