
import java.util.Scanner;

public class P20_LarPrimeFact {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int lar = 1;
        int i, n1;
        n1 = n;
        for (i = 2; i <= n1 / 2; i++) {
            while (n % i == 0) {
                lar = i;
                n = n / i;

            }
        }
        System.out.print(lar);

        num.close();

    }
}