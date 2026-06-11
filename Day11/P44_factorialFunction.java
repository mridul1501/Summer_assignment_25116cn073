
import java.util.Scanner;


public class P44_factorialFunction {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = num.nextInt();
        int f = factorial(n);
        System.out.print("Factorial of " + n + " is : " + f);
        num.close();
    }

}