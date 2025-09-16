import java.util.Scanner;

public class HollowEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for center alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                // Border (first star, last star) or last row
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next row
        }
    }
}
