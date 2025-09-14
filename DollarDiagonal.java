import java.util.Scanner;
public class DollarDiagonal {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows:");
        n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i){

                    System.out.print("$");
                }
                else if( i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*  Expected Output
     $****
     *$  *
     * $ *
     *  $*
     ****$
 */