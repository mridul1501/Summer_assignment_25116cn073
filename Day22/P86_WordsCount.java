
import java.util.Scanner;


public class P86_WordsCount {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
        
        char[] a = str.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ' || a[i] == '\t') {
                count++;
            }

        }
        System.out.print("Number of words = " + (count + 1));

        num.close();
    }

}