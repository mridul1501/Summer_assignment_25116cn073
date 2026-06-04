package Day3;


import java.util.Scanner;
import java.lang.Math;

public class P9_PrimeTest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int count = 0;
        if (n == 1) {
            System.out.print("Neither prime nor composite");
        }
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
                if (count != 0) {
                    System.out.print("Not a Prime Number \n");
                    break;
                }
            }
            if (count == 0)
                System.out.print("Prime Number");
        }

        num.close();
    }
}