
import java.util.Scanner;


public class P41_functionSum {
    static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter both the numbers : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int S;
        S = sum(n1, n2);
        System.out.print(S);
        num.close();
    }

}