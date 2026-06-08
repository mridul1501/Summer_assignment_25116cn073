
import java.util.Scanner;


public class P31_letterPattern {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter rows of pattern :");
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        num.close();
    }

}