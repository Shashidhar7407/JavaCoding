package recursionArrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 9, 3, 5, 2, 6, 12, 12, 12 };
        int key = 12;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int result = getIndexValueofElement(arr, 0, key);
        findAllIndex(arr, 0, key);
        System.out.println(list);
        System.out.println(result);
     ArrayList<Integer>  = new ArrayList<Integer>();

    }

    private static int getIndexValueofElement(int[] arr, int index, int key) {
        if (index > arr.length - 1) {
            return -1;
        } else {
            if (arr[index] == key) {
                return index + 1;
            }
            return getIndexValueofElement(arr, index + 1, key);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int index, int key) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            list.add(index);
        }
        findAllIndex(arr, index + 1, key);

    }

    // returning list of integers

    static ArrayList<Integer> findAllIndexMethod2(int[] arr, int index, int key, ArrayList<Integer> list2) {
        if (index == arr.length) {
            return list2;
        }
        if (arr[index] == key) {
            list.add(index);
        }

        return findAllIndexMethod2(arr, index + 1, key, list2);

    }

}
