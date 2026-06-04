
package Day4;


import java.util.Scanner;

import java.lang.Math;

//define class
public class P15_Armstrong {
  
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

        p = count(n);
        while (n > 0) {
            sumA += Math.pow((n % 10), p);
            n = n / 10;
        }
        n = n1;
        if (sumA == n) {
            System.out.print(n + " ia an Armstrong number .\n");
        } else {
            System.out.print(n + " is not an Armstrong number .\n");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        Arm_Test(n);
        num.close();

    }

}