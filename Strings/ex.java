package Strings;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        String a="kite";
        String b="etik";
        char[] ac=a.toCharArray();
        char[] ab=b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(ab);
        System.out.println(Arrays.toString(ac));
        System.out.println(Arrays.toString(ac));
        if(Arrays.equals(ac,ab)){
            System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }
    }
    
}
