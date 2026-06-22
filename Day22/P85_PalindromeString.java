
import java.util.Scanner;


public class P85_PalindromeString {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();
        char[] r = new char[a.length];

        for (int i = 0; i < a.length; i++) {

            r[i] = a[a.length - 1 - i];
        }
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != r[i])
                count++;

        }

        if (count == 0)
            System.out.print("It is Palindrome String.");
        else
            System.out.print("It is not a Palindrome String.");

        num.close();
    }
}