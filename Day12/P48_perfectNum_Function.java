 
import java.util.Scanner;

public class P48_perfectNum_Function {
    static void perfect(int n) {
        int i, sum = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.print(n + " is a Perfect Number . ");
        else
            System.out.print(n + " is not a Perfect number .");

    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();

        perfect(n);

        num.close();

    }

}