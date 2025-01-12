import java.util.*;

class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Size of the square

        int count = 1; // Starting value
        for (int i = 1; i <= num; i++) { // Loop for rows
            for (int j = 1; j <= num; j++) { // Loop for columns
                System.out.print(count + " ");
                count++; // Increment the number for each cell
            }
            System.out.println(); // Move to the next row
        }
    }
}

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */