package recursion;

public class charUpperinString {
    public static void main(String[] args) {
        String s = " geeks for geekS";
        System.out.println(findUpper(s, 0));
    }

    /**
     * This method finds the first uppercase character in a string using recursion.
     * 
     * @param s the input string
     * @param i the current index in the string
     * @return the first uppercase character in the string, or 0 if no uppercase
     *         character is found
     */
    static char findUpper(String s, int i) {
        if (s.length() == 0 || (i >= s.length())) {
            // Base case: if the string is empty or we've reached the end of the string,
            // return 0
            return 0;
        }
        if (Character.isUpperCase(s.charAt(i))) {
            // If the current character is uppercase, return it
            return s.charAt(i);
        } else {
            // If the current character is not uppercase, recursively call the function with
            // the next index
            return findUpper(s, i + 1);
        }
    }
}