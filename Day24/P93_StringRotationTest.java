
import java.util.Scanner;


public class P93_StringRotationTest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = Sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = Sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.print("Rotation not Possible .");
        } else {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            int i, j, count = 0;

            for (i = 0; i < a.length; i++) {
                for (j = 0; j < a.length; j++) {
                    if (a[(i + j) % a.length] != b[j]) {
                        break;
                    }
                }
                if (j == a.length) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.print("Rotation appeared.");
            } else {
                System.out.print("Rotation not appeared");
            }
        }

        Sc.close();
    }
}