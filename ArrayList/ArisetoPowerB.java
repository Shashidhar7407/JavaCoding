import java.util.*;

public class ArisetoPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(AriasetopowB(value, power));

    }

    static int AriasetopowB(int value, int power) {
        if (power == 1) {
            return value;
        } else {
            return value * (AriasetopowB(value, power - 1));
        }
    }

}
