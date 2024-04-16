public class palindrome {
    public static void main(String[] args) {
        String originalString="madam";
        String reversedString=reverseandCompare(originalString);
        if(reversedString.equals(originalString)){
            System.out.println("given string is palindrome") ;
               }
            }

    public static String reverseandCompare(String str)
    { String reverseString="";
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        return reverseString;
    }
}