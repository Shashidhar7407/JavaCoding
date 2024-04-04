import java.util.*;
public class findDuplicate {

    public static int findtheDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]<nums.length && nums[i]!=nums[correct]){
                    swapNumber(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }

    
    return -1;
}

    public static void swapNumber(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }


    public static void main(String[] args) {
        int[] nums={3,1,2,4,2};
       System.out.println(findtheDuplicate(nums));
       

        
    }
    
}
