//PACKAGE FOR DAY 21 ASSIGNMENT
package Day21;

//IMPORT SCANNER FOR USER INPUT 
import java.util.Scanner;

//DEFINE CLASS
public class P81_Stringlength {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.print("Length of string : " + count);

        num.close();
    }

}