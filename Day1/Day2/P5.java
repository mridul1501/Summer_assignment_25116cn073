import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int sum = 0;
        int n1;
        n1 = n;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        n = n1;

        System.out.print("Sum of digits of " + n + " is " + sum);
        num.close();

    }
}