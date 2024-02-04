public class primeNumber {
    public static void main(String[] args) {
        int num=24;
        if(isPrime(num)){
            System.out.println(num +"Number is prime number");
        }else{
            System.out.println("NUmber is not a prime number");
        }
    }
    
    //method to check the given number is prime or not 
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}