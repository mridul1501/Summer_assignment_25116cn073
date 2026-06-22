
import java.util.Scanner;


public class P88_removeSPACES {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ' || a[i] == '\t') {
                continue;
            }
            System.out.print(a[i]);

        }

        Sc.close();
    }

}