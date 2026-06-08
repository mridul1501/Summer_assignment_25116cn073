
import java.util.Scanner;


public class P29_halfPyaramid {
   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the rows :");
        int i, j;
        int n = num.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        num.close();

    }

}