public class reverseNumber {
    public static void main(String[] args) {
        int x=12345;
        int sum=0,remainder;
        while (x>0){
            remainder=x%10;
            sum=(sum*10)+remainder;
            x=x/10;
        }
        System.out.println(sum);
    }
}