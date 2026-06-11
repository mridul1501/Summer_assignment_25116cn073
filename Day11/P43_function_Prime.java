
import java.util.Scanner;


public class P43_function_Prime {

    static int prime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = num.nextInt();
        int result = prime(n);
        if (result == 0) {
            System.out.print(n + " is a Prime number");
        } else {
            System.out.print(n + " is not a prime number ");
        }
        num.close();
    }
}