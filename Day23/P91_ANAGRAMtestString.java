
import java.util.Scanner;


public class P91_ANAGRAMtestString {
 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = Sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = Sc.nextLine();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32);
            }

        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 'A' && b[i] <= 'Z') {
                b[i] = (char) (b[i] + 32);
            }

        }

        int errorCount = 0;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                int counta = 0;
                int countb = 0;

                for (int j = 0; j < a.length; j++) {

                    if (a[i] == a[j]) {
                        counta++;

                    }

                }

                for (int j = 0; j < b.length; j++) {

                    if (a[i] == b[j]) {
                        countb++;
                    }

                }

                if (counta != countb) {
                    errorCount++;
                    break;
                }

            }

            if (errorCount == 0) {
                System.out.print("It is an ANAGRAM .");

            } else {
                System.out.print("It is not an ANAGRAM .");
            }

        }

        else {
            System.out.print("IT is not an ANAGRAM .");
        }

        Sc.close();

    }

}