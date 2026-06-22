
import java.util.Scanner;


public class P87_characterFrequency {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();
        System.out.print("Enter the character : ");
        char ch = Sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ch) {
                count++;
            }
        }
        System.out.print("Frequency of " + ch + " is " + count);

        Sc.close();
    }

}