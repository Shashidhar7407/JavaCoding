import java.util.*;

public class FindAllDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(nums[i]));
            }
            nums[index] = -nums[index];
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 6, 7, 3, 2, 2, 1, 1, 5 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates);
    }
}