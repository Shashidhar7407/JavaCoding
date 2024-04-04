package recursion;

public class NUmberiinRecursion {
    public static void main(String[] args) {
        print(1);
        
    }

    static void print(int n){
        if(n==5){
            System.out.println(n+"\n");
            return ;
        }
        System.out.println(n);
        print(n+1); // this particular step is called as tail recursion function because this is called last
        // calling the function itself with the different parameters
        // this is called as a recursive call
        //function that calls itself
        //this above code explains how the regression works
        // in recursive the stak memory will keep going contiously
        // base condition is required to stop the recursion like we have written in n value
        // it will consider as an seperate memory when we call the method with different parameters\
        // no base cond the function calls will happen continously and stack gets filled and every call will be taking some memory 
        // if the memory excedds the memory the it's called as stack over flow error

        // why recursion? it helps in solving the bigger/complex problems in a simple way
        // you can convert the recursion soulutions into iterations and vice versa
        // takes the space complexity
        // it also helps in breaking the bigger problems in to smaller problems

    }
    
}
