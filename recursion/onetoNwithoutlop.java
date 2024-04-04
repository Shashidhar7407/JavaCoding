package recursion;

public class onetoNwithoutlop {
    public static void main(String[] args) {
        int n = 5;
        printNUmbers(n);

    }

    static void printNUmbers(int n) {
        if (n <= 0) {
            return;
        }
        printNUmbers(n - 1);
        System.out.println(n);
    }

}

/*----------------------------------------------------------------
 *   printNumbers(5)
                   /      \
printNumbers(4)           5
   /       \
printNumbers(3)  4
  /          \
printNumbers(2)  3
  /          \
printNumbers(1)  2
  /          \
printNumbers(0)  1
 */
