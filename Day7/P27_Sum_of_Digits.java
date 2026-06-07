 
import java.util.Scanner;


public class P27_Sum_of_Digits {
    static int sum(int a) {
        if (a == 0)
            return 0; 
              return (a % 10 + sum(a / 10)); 
    }

    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int S;
        S = sum(n);
        System.out.print("Sum of digits is " + S);
        num.close();
    }
}