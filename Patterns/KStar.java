import java.util.*;
public class KStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print("*");
                }
                else if (i + j == n / 2) {
                    System.out.print("*");
                }
                else if (i - j == n / 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
