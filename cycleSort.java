import java.util.*;
public class cycleSort {
    public static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
