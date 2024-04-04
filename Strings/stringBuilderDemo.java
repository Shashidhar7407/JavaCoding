import java.util.*;

public class stringBuilderDemo {
    public static void main(String[] args) {

        String sample="aaabbbbccccc";
        int length=sample.length();


        StringBuilder bd=new StringBuilder();

        for(int i=0; i<length-1; i++) {
            int sum=1;
            if(sample.charAt(i)==sample.charAt(i+1)){
                sum++;
                System.out.println(sum);

            }
            else{
                bd.append(i).append(sample.charAt(i));
                bd.capacity();
                
            }
        }

        System.out.println(bd.toString());
    }
    
}
