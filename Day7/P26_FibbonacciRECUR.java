
import java.util.Scanner;


public class P26_FibbonacciRECUR {
 static int fibbo(int a) {
        if (a == 0)
            return 0; 
        if (a == 1)
            return 1; 

        return fibbo(a - 1) + fibbo(a - 2); 

    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of terms :");
        int n = num.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibbo(i) + "\t");
        }
        num.close();
    }
}