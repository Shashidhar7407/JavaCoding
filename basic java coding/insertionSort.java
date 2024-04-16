import java.util.*;
public class insertionSort {
    public static void insertionSortNumber(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){  //  here we are just comparing the j value with it's prior value if it is less than j-1 we are swapping
                    swap(arr,j,j-1); // if not we are breaking the loop and we have following the swap logic at the end
                }
                else{
                    break;
                }
            }

        }
    }

    public static void swap(int[] arr, int a, int b) { 
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    
}
public static void main(String[] args) {
    int[] arr={4,5,1,2,8,9,0,-7,-98,-67};
    insertionSortNumber(arr);
    System.out.print("The sorted array is: "+ Arrays.toString(arr));
}
}
