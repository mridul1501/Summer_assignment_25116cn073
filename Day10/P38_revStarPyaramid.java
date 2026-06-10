
import java.util.Scanner;


public class P38_revStarPyaramid {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n = num.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        num.close();
    }

}