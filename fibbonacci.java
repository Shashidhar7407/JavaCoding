public class fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibbonacciNumber(5)));
        int n=5;
        int n1=0;
    int n2=1;
    if(n==0){
        System.out.println(n1);
    }
    else if(n==2){
        System.out.println(n1 +" "+n2);
    }
    else 
    {
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i <= n; i++) {
            int n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

}

public static int fibbonacciNumber(int n){
    if(n==0){
        return 0;


    }
    else if(n==1){
        return 1;
    }
    else{
        fibbonacciNumber(n-1)+fibbonacciNumber(n-2);
    }
}

            
}