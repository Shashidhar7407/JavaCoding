package Strings;

public class BasicString {
    public static void main(String[] args) {
        String name="Shashidhar";
        System.out.println(name);

        //immutabke concept

        String a="Kunal";
        String b="Kunal";
        System.out.println(a+" "+b);
        System.out.println(a==b);
        // The above is the condition where both the object points to the same string

        // now create a new string with two different objects

        String c=new String("Kunal");
        String d=new String("Kunal");
        System.out.println(c==d);
        // here the statment got failed so the  output will be false because both are different and  not pointing to the same memory location
        // Here, even though they have the same  value but they are stored in different memory locations so it returns false// false because they are pointing to different memory locations    


        //we can also check the values using .equals method

        System.out.println(a.equals(b));


    }
    
}
