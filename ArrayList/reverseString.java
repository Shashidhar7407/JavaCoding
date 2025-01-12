package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(arrList);
        String result = String.join(" ", arrList);
        System.out.println(result);
    }

}
