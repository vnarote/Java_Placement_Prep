import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter rows");
        n = s.nextInt();

        // Upper half
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n-1; i >= 1; i--) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*  
    Expected output
           *
          *** 
         ***** 
          *** 
           * 
            



 */