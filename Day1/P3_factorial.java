import java.util.*;

public class P3_factorial {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = num.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of a number is : " + fact);
        num.close();
    }
}