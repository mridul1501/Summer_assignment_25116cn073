package Day3;

import java.util.Scanner;
import java.lang.Math;

public class P10_PrimeinRange {
    
    static void primeTest(int a, int b) {
        int i, j, count;

        for (i = a; i <= b; i++) {
            if (i < 2)
                continue;
            count = 1;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count == 1)
                System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter lower and upper limit of range : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        primeTest(n1, n2);

        num.close();
    }
}