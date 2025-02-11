import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 9, 10, 11, 11, 11, 13, 13, 17, 19, 19, 19, 19, 19, 19 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]) && !list.contains(arr[i])) {
                list.add(arr[i]);

            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(list);
        // System.out.println(set);
        System.out.println(getlist(arr));

    }

    static ArrayList<Integer> getlist(int[] arr) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && !list2.contains(arr[i])) {
                list2.add((Integer) arr[i]);
            }
        }
        return list2;

    }
}
