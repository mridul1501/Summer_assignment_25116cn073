
package Day4;


import java.util.Scanner;
 
import java.lang.Math;
public class P16_Armstrong_Range {
  static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }


    static void Arm_Test(int n) {
        int p, n1, sumA = 0;
        n1 = n;
        // calling function
        p = count(n);
        while (n > 0) {
            sumA += Math.pow((n % 10), p);
            n = n / 10;
        }
        n = n1;
        if (sumA == n) {
            System.out.print(n + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the lower and upper limit respectively : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        for (int i = n1; i <= n2; i++) {
            Arm_Test(i);
        }
        num.close();

    }

}