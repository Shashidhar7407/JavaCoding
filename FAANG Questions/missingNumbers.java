/**
 * missingNumbers
 */
public class missingNumbers {

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=correct){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        
        
        
    }
}