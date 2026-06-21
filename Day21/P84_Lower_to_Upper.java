
import java.util.Scanner;

public class P84_Lower_to_Upper {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char) (a[i] - 32);
            }
            System.out.print(a[i]);
        }
        num.close();
    }
}