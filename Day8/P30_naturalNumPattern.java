
import java.util.Scanner;


public class P30_naturalNumPattern {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter rows of pattern :");
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        num.close();
    }

}