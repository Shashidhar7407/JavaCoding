import java.util.ArrayList;
import java.util.Scanner;

class acronyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        ArrayList<String> arrList = new ArrayList<>();
        for (String words : arr) {
            arrList.add(String.valueOf(words.charAt(0)));

        }
        System.out.println(String.join(".", arrList));

    }
}