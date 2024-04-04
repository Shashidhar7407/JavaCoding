import java.util.List;

/**
 * findallDuplicates
 */
public class findallDuplicates {

    public static List<Integer> findtheDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]<nums.length && nums[i]!=nums[correct]){
                    swapNumber(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }

    
    List<Integer> answer = new ArrayList<>();
    for(int index=0; index<nums.length; index++){
        if(nums[index]!=index+1){
            answer.add(nums[index]);
        }
        }
    }


    public static void swapNumber(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

    public static void main(String[] args) {
        int[] nums={8,6,7,3,2,2,1,1,5};
        findtheDuplicate(nums);
        
        

    }
}