package recursion;



// write a function that takes numbers and print it
//print first 5 digits: 1,2,3,4,5
public class number {
    public static void main(String[] args) {
        print(1);
        
    }

    static void print(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
    


    
}
