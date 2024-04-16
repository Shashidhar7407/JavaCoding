import java.util.*;
public class selectionSort {


    public static void selectionSortArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            // Find the minimum element in unsorted array
            int minValueIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minValueIndex]){
                    minValueIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minValueIndex];
            arr[minValueIndex]=temp;
    }

}
//kunal kunshwaha video

public static void selectionKunal(int[] arr){
    for(int i=0;i<arr.length;i++){
        int last=arr.length-1;
        int maxIndex=getMaxIndex(arr,0,last);
        swapNum(arr,maxIndex,last);
    }
}
public static int getMaxIndex(int[] arr,int start,int end){
    int max=start;
    for(int i=0;i<arr.length;i++){
        if(arr[max]< arr[i]){
            max=i;

        }
    }
    return max;
}

public static void swapNum(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSortArray(arr);
        System.out.println("The sorted array is:"+ Arrays.toString(arr));
        
    }
    
}
