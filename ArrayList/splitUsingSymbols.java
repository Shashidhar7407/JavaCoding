import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class splitUsingSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        String[] arr = command.split(" ");
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.get(arrList.size() - 1).equals("WIN")) {
            arrList.remove(arrList.size() - 1);
            String result = String.join(">", arrList);
            System.out.println(result);
        } else {
            arrList.remove(arrList.size() - 1);
            String result = String.join("/", arrList);
            System.out.println(result);

        }

    }
}