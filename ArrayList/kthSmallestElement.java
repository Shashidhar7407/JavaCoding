import java.util.*;

public class kthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] intArray = sc.nextLine().split(",");
        int position = sc.nextInt();
        System.out.println(getSmallestNumberAtPosition(intArray, position));
    }

    static int getSmallestNumberAtPosition(String[] arr, int pos) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            Integer value = Integer.parseInt(arr[i]);
            arrList.add(value);
        }
        Collections.sort(arrList);
        int smallest = arrList.get(pos - 1);
        return smallest;

    }

}
