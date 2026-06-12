
import java.util.Scanner;


public class P45_FunctionPalindrome {

    static void Palindrome(int a) {
        int rev = 0, n1;
        n1 = a;
        while (a > 0) {
            rev = rev * 10 + (a % 10);
            a = a / 10;
        }

        a = n1;

        if (a == rev) {
            System.out.print("Number " + a + " is Palindrome.");
        } else {
            System.out.print("Number " + a + " is not Palindrome.");
        }
    }
   public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();

        Palindrome(n);

        num.close();
    }

}