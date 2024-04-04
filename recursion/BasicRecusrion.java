package recursion;

public class BasicRecusrion {
    public static void main(String[] args) {
        message();
        
    }

    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
    }
    // here we are calling one funtion in the main class but internally we have created the methods so we can
    // say that as calling function inside the function this is an concept of recursion
    
    
}
