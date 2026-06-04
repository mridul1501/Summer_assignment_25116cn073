

import java.util.*;

public class P8_palindromeTest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int rev = 0, n1;
        n1 = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        n = n1;

        if (n == rev) {
            System.out.print("Number " + n + " is Palindrome.");
        } else {
            System.out.print("Number " + n + " is not Palindrome.");
        }

        num.close();
    }

}