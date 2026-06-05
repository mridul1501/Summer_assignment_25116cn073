
import java.util.Scanner;


public class P18_StrongNum {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int fact, Fsum = 0, i, n1;
        n1 = n;
        while (n > 0) {
            fact = 1;
            for (i = 1; i <= (n % 10); i++) {
                fact = fact * i;
            }
            Fsum += fact;
            n = n / 10;
        }
        n = n1;
        if (Fsum == n)
            System.out.print(n + " is a Strong number .");
        else
            System.out.print(n + " is not a Strong number .");

        num.close();
    }

}