import java.util.Scanner;
public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=s.nextInt();
        char c;
        for(int i=0;i<n;i++){
            c='A';
           for(int j=i;j<n-1;j++){
            System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
            System.out.print(c+" ");
            c++;
           }
           System.out.println();
        }
    }
}

/*
    Expected output

         A
        A B 
       A B C 
      A B C D 
     A B C D E
 */