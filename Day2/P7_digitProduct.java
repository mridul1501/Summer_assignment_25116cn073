import java.util.*;

public class P7_digitProduct {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int P = 1, n1;
        n1 = n;
        while (n > 0) {
            P *= (n % 10);
            n = n / 10;
        }

        n = n1;
        System.out.print("Product of digits of number " + n + " is " + P);

        num.close();
    }

}