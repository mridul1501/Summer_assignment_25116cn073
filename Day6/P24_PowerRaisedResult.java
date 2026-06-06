 
import java.util.Scanner;

public class P24_PowerRaisedResult {
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a base number : ");
        int x = num.nextInt();
        System.out.print("Enter base raise to power : ");
        int n = num.nextInt();

        if (x == 0 && n == 0) {
            System.out.print("Undifined");

        }
        if (x > 0 && n == 0) {
            System.out.print("1");
        }
        int r1 = 1;
        float r2 = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                r1 = r1 * x;
            }
            System.out.print(r1);
        } else {
            for (int i = 1; i <= -n; i++) {
                r2 = r2 * x;
            }
            r2 = 1 / r2;
            System.out.print(r2);
        }
        num.close();

    }
}