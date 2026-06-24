
import java.util.Scanner;

public class P96_REMOVEduplicateCh {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = Sc.nextLine();
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32);
            }

        }

        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;

                }
            }
            if (j == i) {
                System.out.print(a[i]);
            }
        }

        Sc.close();
    }

}