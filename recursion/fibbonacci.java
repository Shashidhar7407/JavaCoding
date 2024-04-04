package recursion;


// we can get the logic of fibbonacci by fib(N)= fib(N-1)+fib(N-2)
// this small logic we can build by checking the example
// here we can break down into smaller problems
//

public class fibbonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
        
    }


    static int fib(int n) {
        // base condition
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
}
