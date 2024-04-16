public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String : " + str);
        String reverseString="";
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        System.out.println("Reversed String : " + reverseString);
        System.out.println(reverseStrings(str));
    }


    public static String reverseStrings(String str){
        char [] reverseString=str.toCharArray();
        int start=0,end=reverseString.length-1;
         while(start<end){
            char temp=reverseString[start];
            reverseString[start] = reverseString[end];
            reverseString[end]=temp;
            start++;
            end--;
         }
         return new String(reverseString);
        }
    }   