import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and inner spaces
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
