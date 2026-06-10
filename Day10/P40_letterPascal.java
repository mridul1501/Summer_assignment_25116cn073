import java.util.Scanner;


public class P40_letterPascal {
     public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n = num.nextInt();
        int i, j, k, l;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print((char) ('A' + k));
            }
            for (l = i - 2; l >= 0; l--) {
                System.out.print((char) ('A' + l));
            }
            System.out.println();
        }
        num.close();
    }

}